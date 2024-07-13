package cn.pan.esdeathcli.commom;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final String ip;
    private static final int pid;

    static {
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
            pid = getPid();
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to get local host address", e);
        }
    }

    public static String generateID() {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.put(ipToBytes());
        buffer.putInt(pid);
        buffer.putLong(System.currentTimeMillis());
        buffer.putInt(counter.getAndIncrement());
        return HexUtil.bytesToHex(buffer.array());
    }

    private static byte[] ipToBytes() {
        String[] parts = IdGenerator.ip.split("\\.");
        byte[] bytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            bytes[i] = (byte) Integer.parseInt(parts[i]);
        }
        return bytes;
    }

    private static int getPid() {
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        return Integer.parseInt(processName.split("@")[0]);
    }
}
