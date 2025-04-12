/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$a;

public final class Mb1 {
    public final long a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Long i;
    public final Long j;
    public final String k;

    public Mb1(long l2, Long l3, Long l4, String string2, String string3, String string4, String string5, Integer n3, Long l7, Long l8, String string6) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = n3;
        this.i = l7;
        this.j = l8;
        this.k = string6;
    }

    public final HttpTransaction$a a() {
        Object object = this.k;
        object = object != null ? HttpTransaction$a.Failed : ((object = this.h) == null ? HttpTransaction$a.Requested : HttpTransaction$a.Complete);
        return object;
    }
}

