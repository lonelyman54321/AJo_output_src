/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;

public abstract class SpliceCommand
implements Metadata$Entry {
    public final /* synthetic */ d d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        String string2 = this.getClass().getSimpleName();
        return "SCTE-35 splice command: type=".concat(string2);
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final /* synthetic */ byte[] w() {
        return null;
    }
}

