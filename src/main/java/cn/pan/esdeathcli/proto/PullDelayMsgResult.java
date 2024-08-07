// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

/**
 * <pre>
 * 拉取延迟消息响应
 * </pre>
 *
 * Protobuf type {@code esdeath.PullDelayMsgResult}
 */
public final class PullDelayMsgResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:esdeath.PullDelayMsgResult)
    PullDelayMsgResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      PullDelayMsgResult.class.getName());
  }
  // Use PullDelayMsgResult.newBuilder() to construct.
  private PullDelayMsgResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PullDelayMsgResult() {
    topic_ = "";
    tag_ = "";
    msgId_ = "";
    payload_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EsdeathProto.internal_static_esdeath_PullDelayMsgResult_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EsdeathProto.internal_static_esdeath_PullDelayMsgResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PullDelayMsgResult.class, Builder.class);
  }

  private int bitField0_;
  public static final int BASERESULT_FIELD_NUMBER = 1;
  private BaseResult baseResult_;
  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   * @return Whether the baseResult field is set.
   */
  @Override
  public boolean hasBaseResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   * @return The baseResult.
   */
  @Override
  public BaseResult getBaseResult() {
    return baseResult_ == null ? BaseResult.getDefaultInstance() : baseResult_;
  }
  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   */
  @Override
  public BaseResultOrBuilder getBaseResultOrBuilder() {
    return baseResult_ == null ? BaseResult.getDefaultInstance() : baseResult_;
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

  public static final int TAG_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile Object tag_ = "";
  /**
   * <code>string tag = 3;</code>
   * @return The tag.
   */
  @Override
  public String getTag() {
    Object ref = tag_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>string tag = 3;</code>
   * @return The bytes for tag.
   */
  @Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    Object ref = tag_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tag_ = b;
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

  public static final int PAYLOAD_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile Object payload_ = "";
  /**
   * <code>string payload = 5;</code>
   * @return The payload.
   */
  @Override
  public String getPayload() {
    Object ref = payload_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      payload_ = s;
      return s;
    }
  }
  /**
   * <code>string payload = 5;</code>
   * @return The bytes for payload.
   */
  @Override
  public com.google.protobuf.ByteString
      getPayloadBytes() {
    Object ref = payload_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      payload_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getBaseResult());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, topic_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tag_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, tag_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, msgId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(payload_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, payload_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseResult());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, topic_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tag_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, tag_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msgId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, msgId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(payload_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, payload_);
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
    if (!(obj instanceof PullDelayMsgResult)) {
      return super.equals(obj);
    }
    PullDelayMsgResult other = (PullDelayMsgResult) obj;

    if (hasBaseResult() != other.hasBaseResult()) return false;
    if (hasBaseResult()) {
      if (!getBaseResult()
          .equals(other.getBaseResult())) return false;
    }
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (!getTag()
        .equals(other.getTag())) return false;
    if (!getMsgId()
        .equals(other.getMsgId())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
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
    if (hasBaseResult()) {
      hash = (37 * hash) + BASERESULT_FIELD_NUMBER;
      hash = (53 * hash) + getBaseResult().hashCode();
    }
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + getMsgId().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PullDelayMsgResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PullDelayMsgResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PullDelayMsgResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PullDelayMsgResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PullDelayMsgResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PullDelayMsgResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PullDelayMsgResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static PullDelayMsgResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static PullDelayMsgResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static PullDelayMsgResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PullDelayMsgResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static PullDelayMsgResult parseFrom(
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
  public static Builder newBuilder(PullDelayMsgResult prototype) {
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
   * 拉取延迟消息响应
   * </pre>
   *
   * Protobuf type {@code esdeath.PullDelayMsgResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:esdeath.PullDelayMsgResult)
      PullDelayMsgResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EsdeathProto.internal_static_esdeath_PullDelayMsgResult_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EsdeathProto.internal_static_esdeath_PullDelayMsgResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PullDelayMsgResult.class, Builder.class);
    }

    // Construct using cn.pan.esdeathcli.proto.PullDelayMsgResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getBaseResultFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      baseResult_ = null;
      if (baseResultBuilder_ != null) {
        baseResultBuilder_.dispose();
        baseResultBuilder_ = null;
      }
      topic_ = "";
      tag_ = "";
      msgId_ = "";
      payload_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EsdeathProto.internal_static_esdeath_PullDelayMsgResult_descriptor;
    }

    @Override
    public PullDelayMsgResult getDefaultInstanceForType() {
      return PullDelayMsgResult.getDefaultInstance();
    }

    @Override
    public PullDelayMsgResult build() {
      PullDelayMsgResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PullDelayMsgResult buildPartial() {
      PullDelayMsgResult result = new PullDelayMsgResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(PullDelayMsgResult result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseResult_ = baseResultBuilder_ == null
            ? baseResult_
            : baseResultBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tag_ = tag_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.msgId_ = msgId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.payload_ = payload_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof PullDelayMsgResult) {
        return mergeFrom((PullDelayMsgResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PullDelayMsgResult other) {
      if (other == PullDelayMsgResult.getDefaultInstance()) return this;
      if (other.hasBaseResult()) {
        mergeBaseResult(other.getBaseResult());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getMsgId().isEmpty()) {
        msgId_ = other.msgId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getPayload().isEmpty()) {
        payload_ = other.payload_;
        bitField0_ |= 0x00000010;
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
              input.readMessage(
                  getBaseResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              topic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              tag_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              msgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              payload_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private BaseResult baseResult_;
    private com.google.protobuf.SingleFieldBuilder<
        BaseResult, BaseResult.Builder, BaseResultOrBuilder> baseResultBuilder_;
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     * @return Whether the baseResult field is set.
     */
    public boolean hasBaseResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     * @return The baseResult.
     */
    public BaseResult getBaseResult() {
      if (baseResultBuilder_ == null) {
        return baseResult_ == null ? BaseResult.getDefaultInstance() : baseResult_;
      } else {
        return baseResultBuilder_.getMessage();
      }
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public Builder setBaseResult(BaseResult value) {
      if (baseResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseResult_ = value;
      } else {
        baseResultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public Builder setBaseResult(
        BaseResult.Builder builderForValue) {
      if (baseResultBuilder_ == null) {
        baseResult_ = builderForValue.build();
      } else {
        baseResultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public Builder mergeBaseResult(BaseResult value) {
      if (baseResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          baseResult_ != null &&
          baseResult_ != BaseResult.getDefaultInstance()) {
          getBaseResultBuilder().mergeFrom(value);
        } else {
          baseResult_ = value;
        }
      } else {
        baseResultBuilder_.mergeFrom(value);
      }
      if (baseResult_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public Builder clearBaseResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      baseResult_ = null;
      if (baseResultBuilder_ != null) {
        baseResultBuilder_.dispose();
        baseResultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public BaseResult.Builder getBaseResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBaseResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    public BaseResultOrBuilder getBaseResultOrBuilder() {
      if (baseResultBuilder_ != null) {
        return baseResultBuilder_.getMessageOrBuilder();
      } else {
        return baseResult_ == null ?
            BaseResult.getDefaultInstance() : baseResult_;
      }
    }
    /**
     * <code>.esdeath.BaseResult baseResult = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        BaseResult, BaseResult.Builder, BaseResultOrBuilder>
        getBaseResultFieldBuilder() {
      if (baseResultBuilder_ == null) {
        baseResultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            BaseResult, BaseResult.Builder, BaseResultOrBuilder>(
                getBaseResult(),
                getParentForChildren(),
                isClean());
        baseResult_ = null;
      }
      return baseResultBuilder_;
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

    private Object tag_ = "";
    /**
     * <code>string tag = 3;</code>
     * @return The tag.
     */
    public String getTag() {
      Object ref = tag_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string tag = 3;</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tag = 3;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      tag_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      tag_ = getDefaultInstance().getTag();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 3;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tag_ = value;
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

    private Object payload_ = "";
    /**
     * <code>string payload = 5;</code>
     * @return The payload.
     */
    public String getPayload() {
      Object ref = payload_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        payload_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string payload = 5;</code>
     * @return The bytes for payload.
     */
    public com.google.protobuf.ByteString
        getPayloadBytes() {
      Object ref = payload_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        payload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string payload = 5;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      payload_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string payload = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      payload_ = getDefaultInstance().getPayload();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string payload = 5;</code>
     * @param value The bytes for payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      payload_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:esdeath.PullDelayMsgResult)
  }

  // @@protoc_insertion_point(class_scope:esdeath.PullDelayMsgResult)
  private static final PullDelayMsgResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PullDelayMsgResult();
  }

  public static PullDelayMsgResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullDelayMsgResult>
      PARSER = new com.google.protobuf.AbstractParser<PullDelayMsgResult>() {
    @Override
    public PullDelayMsgResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PullDelayMsgResult> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PullDelayMsgResult> getParserForType() {
    return PARSER;
  }

  @Override
  public PullDelayMsgResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

