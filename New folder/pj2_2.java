/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PJ2
 */
public abstract class pj2_2 {
    public static final PJ2$a Companion;

    static {
        PJ2$a pJ2$a;
        Companion = pJ2$a = new Object();
    }

    public static final pj2_2 create(ff_2 ff_22, jn1_0 jn1_02) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(ff_22, "<this>");
        nj2_2 nj2_22 = new nj2_2(jn1_02, ff_22);
        return nj2_22;
    }

    public static final pj2_2 create(jn1_0 jn1_02, ff_2 ff_22) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(ff_22, "content");
        Intrinsics.checkNotNullParameter(ff_22, "<this>");
        nj2_2 nj2_22 = new nj2_2(jn1_02, ff_22);
        return nj2_22;
    }

    public static final pj2_2 create(jn1_0 jn1_02, File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        return PJ2$a.a(jn1_02, file);
    }

    public static final pj2_2 create(jn1_0 jn1_02, String string2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(string2, "content");
        return PJ2$a.c(string2, jn1_02);
    }

    public static final pj2_2 create(jn1_0 jn1_02, byte[] byArray) {
        Companion.getClass();
        String string2 = "content";
        Intrinsics.checkNotNullParameter(byArray, string2);
        int n3 = byArray.length;
        Intrinsics.checkNotNullParameter(byArray, string2);
        return PJ2$a.b(jn1_02, byArray, 0, n3);
    }

    public static final pj2_2 create(jn1_0 jn1_02, byte[] byArray, int n3) {
        Companion.getClass();
        String string2 = "content";
        Intrinsics.checkNotNullParameter(byArray, string2);
        int n4 = byArray.length;
        Intrinsics.checkNotNullParameter(byArray, string2);
        return PJ2$a.b(jn1_02, byArray, n3, n4);
    }

    public static final pj2_2 create(jn1_0 jn1_02, byte[] byArray, int n3, int n4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(byArray, "content");
        return PJ2$a.b(jn1_02, byArray, n3, n4);
    }

    public static final pj2_2 create(File file, jn1_0 jn1_02) {
        Companion.getClass();
        return PJ2$a.a(jn1_02, file);
    }

    public static final pj2_2 create(String string2, jn1_0 jn1_02) {
        Companion.getClass();
        return PJ2$a.c(string2, jn1_02);
    }

    public static final pj2_2 create(byte[] byArray) {
        PJ2$a pJ2$a = Companion;
        pJ2$a.getClass();
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        return PJ2$a.d(pJ2$a, byArray, null, 0, 7);
    }

    public static final pj2_2 create(byte[] byArray, jn1_0 jn1_02) {
        PJ2$a pJ2$a = Companion;
        pJ2$a.getClass();
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        return PJ2$a.d(pJ2$a, byArray, jn1_02, 0, 6);
    }

    public static final pj2_2 create(byte[] byArray, jn1_0 jn1_02, int n3) {
        PJ2$a pJ2$a = Companion;
        pJ2$a.getClass();
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        return PJ2$a.d(pJ2$a, byArray, jn1_02, n3, 4);
    }

    public static final pj2_2 create(byte[] byArray, jn1_0 jn1_02, int n3, int n4) {
        Companion.getClass();
        return PJ2$a.b(jn1_02, byArray, n3, n4);
    }

    public long contentLength() {
        return -1;
    }

    public abstract jn1_0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(re_2 var1);
}

