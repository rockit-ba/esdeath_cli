// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

public interface AddDelayMsgResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:esdeath.AddDelayMsgResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   * @return Whether the baseResult field is set.
   */
  boolean hasBaseResult();
  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   * @return The baseResult.
   */
  BaseResult getBaseResult();
  /**
   * <code>.esdeath.BaseResult baseResult = 1;</code>
   */
  BaseResultOrBuilder getBaseResultOrBuilder();

  /**
   * <code>string msgId = 2;</code>
   * @return The msgId.
   */
  String getMsgId();
  /**
   * <code>string msgId = 2;</code>
   * @return The bytes for msgId.
   */
  com.google.protobuf.ByteString
      getMsgIdBytes();
}
