// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.github.silencecorner;

public final class MessageOuterClass {
  private MessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Clock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Clock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\022\005model\"\024\n\005Clock\022\013\n\003now\030\001" +
      " \001(\003\"8\n\007Message\022\016\n\006msg_id\030\001 \001(\003\022\013\n\003ack\030\003" +
      " \001(\003\022\020\n\010long_msg\030\004 \001(\tB\034\n\030com.github.sil" +
      "encecornerP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_model_Clock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_Clock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Clock_descriptor,
        new java.lang.String[] { "Now", });
    internal_static_model_Message_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_model_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Message_descriptor,
        new java.lang.String[] { "MsgId", "Ack", "LongMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
