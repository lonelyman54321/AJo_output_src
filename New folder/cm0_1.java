/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.emoji2.text.EmojiCompat;

/*
 * Renamed from cm0
 */
public final class cm0_1 {
    public ib3_0 a;

    public final ib3_0 a() {
        int n3;
        Object object = EmojiCompat.a();
        int n4 = ((EmojiCompat)object).b();
        if (n4 == (n3 = 1)) {
            object = new ve1_0(n3 != 0);
        } else {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.g(Boolean.FALSE);
            cm0$a cm0$a = new cm0$a(parcelableSnapshotMutableState, this);
            ((EmojiCompat)object).h(cm0$a);
            object = parcelableSnapshotMutableState;
        }
        return object;
    }
}

