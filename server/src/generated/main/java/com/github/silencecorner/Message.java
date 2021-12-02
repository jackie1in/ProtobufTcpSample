// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.github.silencecorner;

/**
 * Protobuf type {@code model.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    longMsg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Message(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            msgId_ = input.readInt64();
            break;
          }
          case 24: {

            ack_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            longMsg_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.silencecorner.MessageOuterClass.internal_static_model_Message_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.silencecorner.MessageOuterClass.internal_static_model_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.silencecorner.Message.class, com.github.silencecorner.Message.Builder.class);
  }

  public static final int MSG_ID_FIELD_NUMBER = 1;
  private long msgId_;
  /**
   * <code>int64 msg_id = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override
  public long getMsgId() {
    return msgId_;
  }

  public static final int ACK_FIELD_NUMBER = 3;
  private long ack_;
  /**
   * <code>int64 ack = 3;</code>
   * @return The ack.
   */
  @java.lang.Override
  public long getAck() {
    return ack_;
  }

  public static final int LONG_MSG_FIELD_NUMBER = 4;
  private volatile java.lang.Object longMsg_;
  /**
   * <code>string long_msg = 4;</code>
   * @return The longMsg.
   */
  @java.lang.Override
  public java.lang.String getLongMsg() {
    java.lang.Object ref = longMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      longMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string long_msg = 4;</code>
   * @return The bytes for longMsg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLongMsgBytes() {
    java.lang.Object ref = longMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      longMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (msgId_ != 0L) {
      output.writeInt64(1, msgId_);
    }
    if (ack_ != 0L) {
      output.writeInt64(3, ack_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(longMsg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, longMsg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, msgId_);
    }
    if (ack_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, ack_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(longMsg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, longMsg_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.silencecorner.Message)) {
      return super.equals(obj);
    }
    com.github.silencecorner.Message other = (com.github.silencecorner.Message) obj;

    if (getMsgId()
        != other.getMsgId()) return false;
    if (getAck()
        != other.getAck()) return false;
    if (!getLongMsg()
        .equals(other.getLongMsg())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMsgId());
    hash = (37 * hash) + ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAck());
    hash = (37 * hash) + LONG_MSG_FIELD_NUMBER;
    hash = (53 * hash) + getLongMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.silencecorner.Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.silencecorner.Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.silencecorner.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.silencecorner.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.silencecorner.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.silencecorner.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.silencecorner.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.silencecorner.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.silencecorner.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.silencecorner.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.silencecorner.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.silencecorner.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.silencecorner.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code model.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.Message)
      com.github.silencecorner.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.silencecorner.MessageOuterClass.internal_static_model_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.silencecorner.MessageOuterClass.internal_static_model_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.silencecorner.Message.class, com.github.silencecorner.Message.Builder.class);
    }

    // Construct using com.github.silencecorner.Message.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0L;

      ack_ = 0L;

      longMsg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.silencecorner.MessageOuterClass.internal_static_model_Message_descriptor;
    }

    @java.lang.Override
    public com.github.silencecorner.Message getDefaultInstanceForType() {
      return com.github.silencecorner.Message.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.silencecorner.Message build() {
      com.github.silencecorner.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.silencecorner.Message buildPartial() {
      com.github.silencecorner.Message result = new com.github.silencecorner.Message(this);
      result.msgId_ = msgId_;
      result.ack_ = ack_;
      result.longMsg_ = longMsg_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.silencecorner.Message) {
        return mergeFrom((com.github.silencecorner.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.silencecorner.Message other) {
      if (other == com.github.silencecorner.Message.getDefaultInstance()) return this;
      if (other.getMsgId() != 0L) {
        setMsgId(other.getMsgId());
      }
      if (other.getAck() != 0L) {
        setAck(other.getAck());
      }
      if (!other.getLongMsg().isEmpty()) {
        longMsg_ = other.longMsg_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.silencecorner.Message parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.silencecorner.Message) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long msgId_ ;
    /**
     * <code>int64 msg_id = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public long getMsgId() {
      return msgId_;
    }
    /**
     * <code>int64 msg_id = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(long value) {
      
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 msg_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0L;
      onChanged();
      return this;
    }

    private long ack_ ;
    /**
     * <code>int64 ack = 3;</code>
     * @return The ack.
     */
    @java.lang.Override
    public long getAck() {
      return ack_;
    }
    /**
     * <code>int64 ack = 3;</code>
     * @param value The ack to set.
     * @return This builder for chaining.
     */
    public Builder setAck(long value) {
      
      ack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ack = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAck() {
      
      ack_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object longMsg_ = "";
    /**
     * <code>string long_msg = 4;</code>
     * @return The longMsg.
     */
    public java.lang.String getLongMsg() {
      java.lang.Object ref = longMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        longMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string long_msg = 4;</code>
     * @return The bytes for longMsg.
     */
    public com.google.protobuf.ByteString
        getLongMsgBytes() {
      java.lang.Object ref = longMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        longMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string long_msg = 4;</code>
     * @param value The longMsg to set.
     * @return This builder for chaining.
     */
    public Builder setLongMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      longMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string long_msg = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongMsg() {
      
      longMsg_ = getDefaultInstance().getLongMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string long_msg = 4;</code>
     * @param value The bytes for longMsg to set.
     * @return This builder for chaining.
     */
    public Builder setLongMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      longMsg_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:model.Message)
  }

  // @@protoc_insertion_point(class_scope:model.Message)
  private static final com.github.silencecorner.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.silencecorner.Message();
  }

  public static com.github.silencecorner.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @java.lang.Override
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Message(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.silencecorner.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

