// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

/**
 * <pre>
 * 消息消费请求
 * </pre>
 *
 * Protobuf type {@code esdeath.DelayMsgAck}
 */
public final class DelayMsgAck extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:esdeath.DelayMsgAck)
    DelayMsgAckOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      DelayMsgAck.class.getName());
  }
  // Use DelayMsgAck.newBuilder() to construct.
  private DelayMsgAck(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DelayMsgAck() {
    status_ = 0;
    topic_ = "";
    consumerGroup_ = "";
    msgId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EsdeathProto.internal_static_esdeath_DelayMsgAck_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EsdeathProto.internal_static_esdeath_DelayMsgAck_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DelayMsgAck.class, Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_ = 0;
  /**
   * <code>.esdeath.AckStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.esdeath.AckStatus status = 1;</code>
   * @return The status.
   */
  @Override public AckStatus getStatus() {
    AckStatus result = AckStatus.forNumber(status_);
    return result == null ? AckStatus.UNRECOGNIZED : result;
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object topic_ = "";
  /**
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  @Override
  public String getTopic() {
    Object ref = topic_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  @Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    Object ref = topic_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMERGROUP_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile Object consumerGroup_ = "";
  /**
   * <code>string consumerGroup = 3;</code>
   * @return The consumerGroup.
   */
  @Override
  public String getConsumerGroup() {
    Object ref = consumerGroup_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      consumerGroup_ = s;
      return s;
    }
  }
  /**
   * <code>string consumerGroup = 3;</code>
   * @return The bytes for consumerGroup.
   */
  @Override
  public com.google.protobuf.ByteString
      getConsumerGroupBytes() {
    Object ref = consumerGroup_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      consumerGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile Object msgId_ = "";
  /**
   * <code>string msgId = 4;</code>
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
   * <code>string msgId = 4;</code>
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
    if (status_ != AckStatus.ACK.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, topic_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(consumerGroup_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, consumerGroup_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, msgId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != AckStatus.ACK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, topic_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(consumerGroup_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, consumerGroup_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, msgId_);
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
    if (!(obj instanceof DelayMsgAck)) {
      return super.equals(obj);
    }
    DelayMsgAck other = (DelayMsgAck) obj;

    if (status_ != other.status_) return false;
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (!getConsumerGroup()
        .equals(other.getConsumerGroup())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + CONSUMERGROUP_FIELD_NUMBER;
    hash = (53 * hash) + getConsumerGroup().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + getMsgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DelayMsgAck parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgAck parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgAck parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgAck parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgAck parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DelayMsgAck parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DelayMsgAck parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static DelayMsgAck parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static DelayMsgAck parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static DelayMsgAck parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DelayMsgAck parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static DelayMsgAck parseFrom(
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
  public static Builder newBuilder(DelayMsgAck prototype) {
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
   * 消息消费请求
   * </pre>
   *
   * Protobuf type {@code esdeath.DelayMsgAck}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:esdeath.DelayMsgAck)
      DelayMsgAckOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EsdeathProto.internal_static_esdeath_DelayMsgAck_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EsdeathProto.internal_static_esdeath_DelayMsgAck_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DelayMsgAck.class, Builder.class);
    }

    // Construct using cn.pan.esdeathcli.proto.DelayMsgAck.newBuilder()
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
      status_ = 0;
      topic_ = "";
      consumerGroup_ = "";
      msgId_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EsdeathProto.internal_static_esdeath_DelayMsgAck_descriptor;
    }

    @Override
    public DelayMsgAck getDefaultInstanceForType() {
      return DelayMsgAck.getDefaultInstance();
    }

    @Override
    public DelayMsgAck build() {
      DelayMsgAck result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DelayMsgAck buildPartial() {
      DelayMsgAck result = new DelayMsgAck(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(DelayMsgAck result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.consumerGroup_ = consumerGroup_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.msgId_ = msgId_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof DelayMsgAck) {
        return mergeFrom((DelayMsgAck)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DelayMsgAck other) {
      if (other == DelayMsgAck.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getConsumerGroup().isEmpty()) {
        consumerGroup_ = other.consumerGroup_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getMsgId().isEmpty()) {
        msgId_ = other.msgId_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              topic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              consumerGroup_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              msgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int status_ = 0;
    /**
     * <code>.esdeath.AckStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.esdeath.AckStatus status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.esdeath.AckStatus status = 1;</code>
     * @return The status.
     */
    @Override
    public AckStatus getStatus() {
      AckStatus result = AckStatus.forNumber(status_);
      return result == null ? AckStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.esdeath.AckStatus status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(AckStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.esdeath.AckStatus status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      onChanged();
      return this;
    }

    private Object topic_ = "";
    /**
     * <code>string topic = 2;</code>
     * @return The topic.
     */
    public String getTopic() {
      Object ref = topic_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      topic_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      topic_ = getDefaultInstance().getTopic();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topic_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private Object consumerGroup_ = "";
    /**
     * <code>string consumerGroup = 3;</code>
     * @return The consumerGroup.
     */
    public String getConsumerGroup() {
      Object ref = consumerGroup_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        consumerGroup_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string consumerGroup = 3;</code>
     * @return The bytes for consumerGroup.
     */
    public com.google.protobuf.ByteString
        getConsumerGroupBytes() {
      Object ref = consumerGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        consumerGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consumerGroup = 3;</code>
     * @param value The consumerGroup to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerGroup(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      consumerGroup_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string consumerGroup = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumerGroup() {
      consumerGroup_ = getDefaultInstance().getConsumerGroup();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string consumerGroup = 3;</code>
     * @param value The bytes for consumerGroup to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      consumerGroup_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private Object msgId_ = "";
    /**
     * <code>string msgId = 4;</code>
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
     * <code>string msgId = 4;</code>
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
     * <code>string msgId = 4;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      msgId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string msgId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      msgId_ = getDefaultInstance().getMsgId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string msgId = 4;</code>
     * @param value The bytes for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      msgId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:esdeath.DelayMsgAck)
  }

  // @@protoc_insertion_point(class_scope:esdeath.DelayMsgAck)
  private static final DelayMsgAck DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DelayMsgAck();
  }

  public static DelayMsgAck getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DelayMsgAck>
      PARSER = new com.google.protobuf.AbstractParser<DelayMsgAck>() {
    @Override
    public DelayMsgAck parsePartialFrom(
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

  public static com.google.protobuf.Parser<DelayMsgAck> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DelayMsgAck> getParserForType() {
    return PARSER;
  }

  @Override
  public DelayMsgAck getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
