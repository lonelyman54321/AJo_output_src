/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.emoji2.text.EmojiCompat$f;

public final class cm0$a
extends EmojiCompat$f {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ cm0_1 b;

    public cm0$a(ParcelableSnapshotMutableState parcelableSnapshotMutableState, cm0_1 cm0_12) {
        this.a = parcelableSnapshotMutableState;
        this.b = cm0_12;
    }

    public final void a() {
        ve1_0 ve1_02 = LK1.a;
        this.b.a = ve1_02;
    }

    public final void b() {
        Object object = Boolean.TRUE;
        this.a.setValue(object);
        this.b.a = object = new ve1_0(true);
    }
}

