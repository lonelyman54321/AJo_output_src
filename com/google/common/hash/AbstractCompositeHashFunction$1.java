/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.AbstractCompositeHashFunction;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Java8Compatibility;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class AbstractCompositeHashFunction$1
implements Hasher {
    final /* synthetic */ AbstractCompositeHashFunction this$0;
    final /* synthetic */ Hasher[] val$hashers;

    public AbstractCompositeHashFunction$1(AbstractCompositeHashFunction abstractCompositeHashFunction, Hasher[] hasherArray) {
        this.this$0 = abstractCompositeHashFunction;
        this.val$hashers = hasherArray;
    }

    public HashCode hash() {
        AbstractCompositeHashFunction abstractCompositeHashFunction = this.this$0;
        Hasher[] hasherArray = this.val$hashers;
        return abstractCompositeHashFunction.makeHash(hasherArray);
    }

    public Hasher putBoolean(boolean bl2) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putBoolean(bl2);
        }
        return this;
    }

    public Hasher putByte(byte by2) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putByte(by2);
        }
        return this;
    }

    public Hasher putBytes(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.position();
        for (Hasher hasher : this.val$hashers) {
            Java8Compatibility.position(byteBuffer, n3);
            hasher.putBytes(byteBuffer);
        }
        return this;
    }

    public Hasher putBytes(byte[] byArray) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putBytes(byArray);
        }
        return this;
    }

    public Hasher putBytes(byte[] byArray, int n3, int n4) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putBytes(byArray, n3, n4);
        }
        return this;
    }

    public Hasher putChar(char c2) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putChar(c2);
        }
        return this;
    }

    public Hasher putDouble(double d2) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putDouble(d2);
        }
        return this;
    }

    public Hasher putFloat(float f5) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putFloat(f5);
        }
        return this;
    }

    public Hasher putInt(int n3) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putInt(n3);
        }
        return this;
    }

    public Hasher putLong(long l2) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putLong(l2);
        }
        return this;
    }

    public Hasher putObject(Object object, Funnel funnel) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putObject(object, funnel);
        }
        return this;
    }

    public Hasher putShort(short s7) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putShort(s7);
        }
        return this;
    }

    public Hasher putString(CharSequence charSequence, Charset charset) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putString(charSequence, charset);
        }
        return this;
    }

    public Hasher putUnencodedChars(CharSequence charSequence) {
        for (Hasher hasher : this.val$hashers) {
            hasher.putUnencodedChars(charSequence);
        }
        return this;
    }
}

