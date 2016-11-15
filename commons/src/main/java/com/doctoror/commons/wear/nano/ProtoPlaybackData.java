// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.doctoror.commons.wear.nano;

@SuppressWarnings("hiding")
public interface ProtoPlaybackData {

  public static final class PlaybackState extends
      com.google.protobuf.nano.MessageNano {

    private static volatile PlaybackState[] _emptyArray;
    public static PlaybackState[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new PlaybackState[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 state = 1;
    public int state;

    // optional int64 progress = 2;
    public long progress;

    // optional int64 duration = 3;
    public long duration;

    public PlaybackState() {
      clear();
    }

    public PlaybackState clear() {
      state = 0;
      progress = 0L;
      duration = 0L;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.state != 0) {
        output.writeInt32(1, this.state);
      }
      if (this.progress != 0L) {
        output.writeInt64(2, this.progress);
      }
      if (this.duration != 0L) {
        output.writeInt64(3, this.duration);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.state != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.state);
      }
      if (this.progress != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(2, this.progress);
      }
      if (this.duration != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(3, this.duration);
      }
      return size;
    }

    @Override
    public PlaybackState mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.state = input.readInt32();
            break;
          }
          case 16: {
            this.progress = input.readInt64();
            break;
          }
          case 24: {
            this.duration = input.readInt64();
            break;
          }
        }
      }
    }

    public static PlaybackState parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new PlaybackState(), data);
    }

    public static PlaybackState parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new PlaybackState().mergeFrom(input);
    }
  }

  public static final class Media extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Media[] _emptyArray;
    public static Media[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Media[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional string title = 1;
    public java.lang.String title;

    // optional int64 duration = 2;
    public long duration;

    // optional string artist = 3;
    public java.lang.String artist;

    // optional string album = 4;
    public java.lang.String album;

    // optional int64 progress = 5;
    public long progress;

    public Media() {
      clear();
    }

    public Media clear() {
      title = "";
      duration = 0L;
      artist = "";
      album = "";
      progress = 0L;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (!this.title.equals("")) {
        output.writeString(1, this.title);
      }
      if (this.duration != 0L) {
        output.writeInt64(2, this.duration);
      }
      if (!this.artist.equals("")) {
        output.writeString(3, this.artist);
      }
      if (!this.album.equals("")) {
        output.writeString(4, this.album);
      }
      if (this.progress != 0L) {
        output.writeInt64(5, this.progress);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (!this.title.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.title);
      }
      if (this.duration != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(2, this.duration);
      }
      if (!this.artist.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.artist);
      }
      if (!this.album.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(4, this.album);
      }
      if (this.progress != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(5, this.progress);
      }
      return size;
    }

    @Override
    public Media mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.title = input.readString();
            break;
          }
          case 16: {
            this.duration = input.readInt64();
            break;
          }
          case 26: {
            this.artist = input.readString();
            break;
          }
          case 34: {
            this.album = input.readString();
            break;
          }
          case 40: {
            this.progress = input.readInt64();
            break;
          }
        }
      }
    }

    public static Media parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Media(), data);
    }

    public static Media parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Media().mergeFrom(input);
    }
  }
}
