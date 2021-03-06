// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.package.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  java.lang.String getCpeUri();
  /**
   * <pre>
   * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getCpeUriBytes();

  /**
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Architecture architecture = 2;</code>
   */
  int getArchitectureValue();
  /**
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Architecture architecture = 2;</code>
   */
  io.grafeas.v1beta1.pkg.Architecture getArchitecture();

  /**
   * <pre>
   * The latest available version of this package in this distribution
   * channel.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
   */
  boolean hasLatestVersion();
  /**
   * <pre>
   * The latest available version of this package in this distribution
   * channel.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
   */
  io.grafeas.v1beta1.pkg.Version getLatestVersion();
  /**
   * <pre>
   * The latest available version of this package in this distribution
   * channel.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
   */
  io.grafeas.v1beta1.pkg.VersionOrBuilder getLatestVersionOrBuilder();

  /**
   * <pre>
   * A freeform string denoting the maintainer of this package.
   * </pre>
   *
   * <code>string maintainer = 4;</code>
   */
  java.lang.String getMaintainer();
  /**
   * <pre>
   * A freeform string denoting the maintainer of this package.
   * </pre>
   *
   * <code>string maintainer = 4;</code>
   */
  com.google.protobuf.ByteString
      getMaintainerBytes();

  /**
   * <pre>
   * The distribution channel-specific homepage for this package.
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The distribution channel-specific homepage for this package.
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The distribution channel-specific description of this package.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The distribution channel-specific description of this package.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
