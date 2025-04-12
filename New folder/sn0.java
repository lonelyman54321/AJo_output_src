/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;

public final class sn0
implements zn0$h$a {
    public final /* synthetic */ zn0 a;
    public final /* synthetic */ zn0$d b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int[] d;

    public /* synthetic */ sn0(zn0 zn02, zn0$d zn0$d, boolean bl2, int[] nArray) {
        this.a = zn02;
        this.b = zn0$d;
        this.c = bl2;
        this.d = nArray;
    }

    public final ImmutableList a(int n3, qp3 qp32, int[] nArray) {
        sn0 sn02 = this;
        Object object = this.a;
        object.getClass();
        yn0_0 yn0_02 = new yn0_0((zn0)object);
        object = this.d;
        Object object2 = object[n3];
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n4 = 0;
        qp3 qp33 = qp32;
        for (int i3 = 0; i3 < (n4 = qp33.a); ++i3) {
            int n7 = nArray[i3];
            zn0$d zn0$d = sn02.b;
            boolean bl2 = sn02.c;
            zn0$a zn0$a = new zn0$a(n3, qp32, i3, zn0$d, n7, bl2, yn0_02, (int)object2);
            immutableList$Builder.add(zn0$a);
        }
        return immutableList$Builder.build();
    }
}

