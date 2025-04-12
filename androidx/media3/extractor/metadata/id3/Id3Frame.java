/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;

public abstract class Id3Frame
implements Metadata$Entry {
    public final String a;

    public Id3Frame(String string2) {
        this.a = string2;
    }

    public final /* synthetic */ d d() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }
}

