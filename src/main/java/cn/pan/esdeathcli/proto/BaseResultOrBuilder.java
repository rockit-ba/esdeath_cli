// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: client.proto
// Protobuf Java Version: 4.27.1

package cn.pan.esdeathcli.proto;

public interface BaseResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:esdeath.BaseResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.esdeath.ResultStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.esdeath.ResultStatus status = 1;</code>
   * @return The status.
   */
  ResultStatus getStatus();

  /**
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  String getDesc();
  /**
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();
}