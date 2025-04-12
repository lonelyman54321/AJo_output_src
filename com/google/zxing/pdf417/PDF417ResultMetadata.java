/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417;

public final class PDF417ResultMetadata {
    private String addressee;
    private int checksum;
    private String fileId;
    private String fileName;
    private long fileSize;
    private boolean lastSegment;
    private int[] optionalData;
    private int segmentCount;
    private int segmentIndex;
    private String sender;
    private long timestamp;

    public PDF417ResultMetadata() {
        long l2;
        int n3;
        this.segmentCount = n3 = -1;
        this.fileSize = l2 = (long)-1;
        this.timestamp = l2;
        this.checksum = n3;
    }

    public String getAddressee() {
        return this.addressee;
    }

    public int getChecksum() {
        return this.checksum;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int[] getOptionalData() {
        return this.optionalData;
    }

    public int getSegmentCount() {
        return this.segmentCount;
    }

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    public String getSender() {
        return this.sender;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isLastSegment() {
        return this.lastSegment;
    }

    public void setAddressee(String string2) {
        this.addressee = string2;
    }

    public void setChecksum(int n3) {
        this.checksum = n3;
    }

    public void setFileId(String string2) {
        this.fileId = string2;
    }

    public void setFileName(String string2) {
        this.fileName = string2;
    }

    public void setFileSize(long l2) {
        this.fileSize = l2;
    }

    public void setLastSegment(boolean bl2) {
        this.lastSegment = bl2;
    }

    public void setOptionalData(int[] nArray) {
        this.optionalData = nArray;
    }

    public void setSegmentCount(int n3) {
        this.segmentCount = n3;
    }

    public void setSegmentIndex(int n3) {
        this.segmentIndex = n3;
    }

    public void setSender(String string2) {
        this.sender = string2;
    }

    public void setTimestamp(long l2) {
        this.timestamp = l2;
    }
}

