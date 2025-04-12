/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher;
import com.google.common.hash.MessageDigestHashFunction$SerializedForm;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class MessageDigestHashFunction
extends AbstractHashFunction
implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    public MessageDigestHashFunction(String object, int n3, String string2) {
        boolean bl2;
        this.toString = string2 = (String)Preconditions.checkNotNull(string2);
        this.prototype = object = MessageDigestHashFunction.getMessageDigest((String)object);
        int n4 = ((MessageDigest)object).getDigestLength();
        int n7 = 4;
        n7 = n3 >= n7 && n3 <= n4 ? 1 : 0;
        Preconditions.checkArgument(n7 != 0, "bytes (%s) must be >= 4 and < %s", n3, n4);
        this.bytes = n3;
        this.supportsClone = bl2 = MessageDigestHashFunction.supportsClone((MessageDigest)object);
    }

    public MessageDigestHashFunction(String object, String string2) {
        boolean bl2;
        int n3;
        this.prototype = object = MessageDigestHashFunction.getMessageDigest((String)object);
        this.bytes = n3 = ((MessageDigest)object).getDigestLength();
        this.toString = string2 = (String)Preconditions.checkNotNull(string2);
        this.supportsClone = bl2 = MessageDigestHashFunction.supportsClone((MessageDigest)object);
    }

    private static MessageDigest getMessageDigest(String string2) {
        try {
            return MessageDigest.getInstance(string2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            AssertionError assertionError = new AssertionError((Object)noSuchAlgorithmException);
            throw assertionError;
        }
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return false;
        }
    }

    public int bits() {
        return this.bytes * 8;
    }

    public Hasher newHasher() {
        MessageDigestHashFunction$MessageDigestHasher messageDigestHashFunction$MessageDigestHasher;
        int n3;
        Object object;
        boolean bl2 = this.supportsClone;
        if (bl2) {
            try {
                object = this.prototype;
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {}
            object = ((MessageDigest)object).clone();
            object = (MessageDigest)object;
            n3 = this.bytes;
            messageDigestHashFunction$MessageDigestHasher = new MessageDigestHashFunction$MessageDigestHasher((MessageDigest)object, n3, null);
            return messageDigestHashFunction$MessageDigestHasher;
        }
        object = MessageDigestHashFunction.getMessageDigest(this.prototype.getAlgorithm());
        n3 = this.bytes;
        messageDigestHashFunction$MessageDigestHasher = new MessageDigestHashFunction$MessageDigestHasher((MessageDigest)object, n3, null);
        return messageDigestHashFunction$MessageDigestHasher;
    }

    public String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        String string2 = this.prototype.getAlgorithm();
        int n3 = this.bytes;
        String string3 = this.toString;
        MessageDigestHashFunction$SerializedForm messageDigestHashFunction$SerializedForm = new MessageDigestHashFunction$SerializedForm(string2, n3, string3, null);
        return messageDigestHashFunction$SerializedForm;
    }
}

