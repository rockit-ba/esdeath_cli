// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

/**
 * <pre>
 * 取消延迟消息请求
 * </pre>
 *
 * Protobuf type {@code esdeath.DelayMsgCancel}
 */
public final class DelayMsgCancel extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:esdeath.DelayMsgCancel)
    DelayMsgCancelOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      DelayMsgCancel.class.getName());
  }
  // Use DelayMsgCancel.newBuilder() to construct.
  private DelayMsgCancel(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DelayMsgCancel() {
    msgId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EsdeathProto.internal_static_esdeath_DelayMsgCancel_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EsdeathProto.internal_static_esdeath_DelayMsgCancel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DelayMsgCancel.class, Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object msgId_ = "";
  /**
   * <code>string msgId = 1;</code>
   * @return The msgId.
   */
  @Override
  public String getMsgId() {
    Object ref = msgId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      msgId_ = s;
      return s;
    }
  }
  /**
   * <code>string msgId = 1;</code>
   * @return The bytes for msgId.
   */
  @Override
  public com.google.protobuf.ByteString
      getMsgIdBytes() {
    Object ref = msgId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      msgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, msgId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, msgId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof DelayMsgCancel)) {
      return super.equals(obj);
    }
    DelayMsgCancel other = (DelayMsgCancel) obj;

    if (!getMsgId()
        .equals(other.getMsgId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + getMsgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DelayMsgCancel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgCancel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgCancel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgCancel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgCancel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgCancel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgCancel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static DelayMsgCancel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static DelayMsgCancel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static DelayMsgCancel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DelayMsgCancel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static DelayMsgCancel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(DelayMsgCancel prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 取消延迟消息请求
   * </pre>
   *
   * Protobuf type {@code esdeath.DelayMsgCancel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:esdeath.DelayMsgCancel)
      DelayMsgCancelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EsdeathProto.internal_static_esdeath_DelayMsgCancel_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EsdeathProto.internal_static_esdeath_DelayMsgCancel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DelayMsgCancel.class, Builder.class);
    }

    // Construct using cn.pan.esdeathcli.proto.DelayMsgCancel.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      msgId_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EsdeathProto.internal_static_esdeath_DelayMsgCancel_descriptor;
    }

    @Override
    public DelayMsgCancel getDefaultInstanceForType() {
      return DelayMsgCancel.getDefaultInstance();
    }

    @Override
    public DelayMsgCancel build() {
      DelayMsgCancel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DelayMsgCancel buildPartial() {
      DelayMsgCancel result = new DelayMsgCancel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(DelayMsgCancel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.msgId_ = msgId_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof DelayMsgCancel) {
        return mergeFrom((DelayMsgCancel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DelayMsgCancel other) {
      if (other == DelayMsgCancel.getDefaultInstance()) return this;
      if (!other.getMsgId().isEmpty()) {
        msgId_ = other.msgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              msgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Object msgId_ = "";
    /**
     * <code>string msgId = 1;</code>
     * @return The msgId.
     */
    public String getMsgId() {
      Object ref = msgId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        msgId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string msgId = 1;</code>
     * @return The bytes for msgId.
     */
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      Object ref = msgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgId = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      msgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      msgId_ = getDefaultInstance().getMsgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string msgId = 1;</code>
     * @param value The bytes for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      msgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:esdeath.DelayMsgCancel)
  }

  // @@protoc_insertion_point(class_scope:esdeath.DelayMsgCancel)
  private static final DelayMsgCancel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DelayMsgCancel();
  }

  public static DelayMsgCancel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DelayMsgCancel>
      PARSER = new com.google.protobuf.AbstractParser<DelayMsgCancel>() {
    @Override
    public DelayMsgCancel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DelayMsgCancel> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DelayMsgCancel> getParserForType() {
    return PARSER;
  }

  @Override
  public DelayMsgCancel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

