/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Mx2
 */
public final class mx2_2 {
    public static final /* synthetic */ int a;

    public static void a(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = String.format(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

