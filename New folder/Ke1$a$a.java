/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class Ke1$a$a {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public Ke1$a$a() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
    }

    public Ke1$a$a(String string2, float f5, float f6, float f7, float f8, float f11, float f12, float f14, List list, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = "";
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((n4 = n3 & 4) != 0) {
            f6 = 0.0f;
        }
        if ((n4 = n3 & 8) != 0) {
            f7 = 0.0f;
        }
        if ((n4 = n3 & 0x10) != 0) {
            f8 = 1.0f;
        }
        if ((n4 = n3 & 0x20) != 0) {
            f11 = 1.0f;
        }
        if ((n4 = n3 & 0x40) != 0) {
            f12 = 0.0f;
        }
        if ((n4 = n3 & 0x80) != 0) {
            f14 = 0.0f;
        }
        if ((n3 &= 0x100) != 0) {
            list = DA3.a;
        }
        ArrayList arrayList = new ArrayList();
        this.a = string2;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = f11;
        this.g = f12;
        this.h = f14;
        this.i = list;
        this.j = arrayList;
    }
}

