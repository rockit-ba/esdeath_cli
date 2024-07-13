package cn.pan.esdeathcli.commom;


public class HexUtil {
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public static String strToHex(String str) {
        return bytesToHex(str.getBytes());
    }
}
