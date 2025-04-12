/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.x;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wu
 */
public final class wu_0
extends jD3 {
    public final UUID a;
    public WeakReference b;

    public wu_0(x x5) {
        String string2 = "SaveableStateHolder_BackStackEntryKey";
        UUID uUID = (UUID)x5.b(string2);
        if (uUID == null) {
            uUID = UUID.randomUUID();
            x5.c(uUID, string2);
        }
        this.a = uUID;
    }

    public final void onCleared() {
        super.onCleared();
        Object object = this.b;
        Object object2 = null;
        String string2 = "saveableStateHolderRef";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object = (bs2_1)((Reference)object).get();
        if (object != null) {
            UUID uUID = this.a;
            object.d(uUID);
        }
        if ((object = this.b) != null) {
            object2 = object;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        }
        ((Reference)object2).clear();
    }
}

