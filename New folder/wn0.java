/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;

public final class wn0
implements zn0$h$a {
    public final /* synthetic */ zn0$d a;
    public final /* synthetic */ String b;

    public /* synthetic */ wn0(zn0$d zn0$d, String string2) {
        this.a = zn0$d;
        this.b = string2;
    }

    public final ImmutableList a(int n3, qp3 qp32, int[] nArray) {
        int n4;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        for (int i3 = 0; i3 < (n4 = qp32.a); ++i3) {
            int n7 = nArray[i3];
            zn0$d zn0$d = this.a;
            String string2 = this.b;
            zn0$g zn0$g = new zn0$g(n3, qp32, i3, zn0$d, n7, string2);
            immutableList$Builder.add(zn0$g);
        }
        return immutableList$Builder.build();
    }
}

