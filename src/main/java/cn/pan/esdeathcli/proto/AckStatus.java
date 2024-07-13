// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

/**
 * Protobuf enum {@code esdeath.AckStatus}
 */
public enum AckStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACK = 0;</code>
   */
  ACK(0),
  /**
   * <code>RECONSUME = 1;</code>
   */
  RECONSUME(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      AckStatus.class.getName());
  }
  /**
   * <code>ACK = 0;</code>
   */
  public static final int ACK_VALUE = 0;
  /**
   * <code>RECONSUME = 1;</code>
   */
  public static final int RECONSUME_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static AckStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AckStatus forNumber(int value) {
    switch (value) {
      case 0: return ACK;
      case 1: return RECONSUME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AckStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AckStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AckStatus>() {
          public AckStatus findValueByNumber(int number) {
            return AckStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return EsdeathProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AckStatus[] VALUES = values();

  public static AckStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AckStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:esdeath.AckStatus)
}
