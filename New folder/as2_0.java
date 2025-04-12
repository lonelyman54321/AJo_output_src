/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from As2
 */
public final class as2_0 {
    public static zs2_0 a() {
        int n3;
        D3$d d3$d = D3$d.a;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        int n8 = 33;
        int n10 = 2;
        n3 = n4 >= n8 || n4 >= n7 && (n3 = C3.a()) >= n10 ? A3.a() : -1 >>> 1;
        D3$b$a d3$b$a = D3$b$a.a;
        String string2 = "mediaType";
        Intrinsics.checkNotNullParameter(d3$d, string2);
        String string3 = "defaultTab";
        Intrinsics.checkNotNullParameter(d3$b$a, string3);
        if (n4 >= n8 || n4 >= n7 && (n4 = C3.a()) >= n10) {
            A3.a();
        }
        Intrinsics.checkNotNullParameter(d3$d, string2);
        Intrinsics.checkNotNullParameter(d3$b$a, string3);
        zs2_0 zs2_02 = new zs2_0();
        String string4 = "<set-?>";
        Intrinsics.checkNotNullParameter(d3$d, string4);
        zs2_02.a = d3$d;
        zs2_02.b = n3;
        zs2_02.c = false;
        Intrinsics.checkNotNullParameter(d3$b$a, string4);
        zs2_02.d = d3$b$a;
        zs2_02.e = false;
        zs2_02.f = 0L;
        return zs2_02;
    }
}

