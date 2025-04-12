/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a$a;
import androidx.lifecycle.i$a$a$a;
import androidx.lifecycle.i$a$b;
import androidx.lifecycle.i$b;
import kotlin.jvm.internal.Intrinsics;

public final class i$a
extends Enum {
    private static final /* synthetic */ i$a[] $VALUES;
    public static final i$a$a Companion;
    public static final /* enum */ i$a ON_ANY;
    public static final /* enum */ i$a ON_CREATE;
    public static final /* enum */ i$a ON_DESTROY;
    public static final /* enum */ i$a ON_PAUSE;
    public static final /* enum */ i$a ON_RESUME;
    public static final /* enum */ i$a ON_START;
    public static final /* enum */ i$a ON_STOP;

    private static final /* synthetic */ i$a[] $values() {
        i$a i$a = ON_CREATE;
        i$a = ON_START;
        i$a = ON_RESUME;
        i$a = ON_PAUSE;
        i$a = ON_STOP;
        i$a = ON_DESTROY;
        i$a = ON_ANY;
        i$a[] i$aArray = new i$a[]{i$a, i$a, i$a, i$a, i$a, i$a, i$a};
        return i$aArray;
    }

    static {
        Object object;
        ON_CREATE = object = new i$a("ON_CREATE", 0);
        ON_START = object = new i$a("ON_START", 1);
        ON_RESUME = object = new i$a("ON_RESUME", 2);
        ON_PAUSE = object = new i$a("ON_PAUSE", 3);
        ON_STOP = object = new i$a("ON_STOP", 4);
        ON_DESTROY = object = new i$a("ON_DESTROY", 5);
        ON_ANY = object = new i$a("ON_ANY", 6);
        $VALUES = i$a.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i$a() {
        void var2_-1;
        void var1_-1;
    }

    public static final i$a downFrom(i$b i$b) {
        Companion.getClass();
        return i$a$a.a(i$b);
    }

    public static final i$a downTo(i$b enum_) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(enum_, "state");
        int[] nArray = i$a$a$a.$EnumSwitchMapping$0;
        int n3 = enum_.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    n3 = 0;
                    enum_ = null;
                } else {
                    enum_ = ON_DESTROY;
                }
            } else {
                enum_ = ON_PAUSE;
            }
        } else {
            enum_ = ON_STOP;
        }
        return enum_;
    }

    public static final i$a upFrom(i$b i$b) {
        Companion.getClass();
        return i$a$a.b(i$b);
    }

    public static final i$a upTo(i$b i$b) {
        Companion.getClass();
        return i$a$a.c(i$b);
    }

    public static i$a valueOf(String string2) {
        return Enum.valueOf(i$a.class, string2);
    }

    public static i$a[] values() {
        return (i$a[])$VALUES.clone();
    }

    public final i$b getTargetState() {
        Object object = i$a$b.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        switch (n4) {
            default: {
                object = new IllegalArgumentException;
                CharSequence charSequence = new StringBuilder();
                charSequence.append((Object)this);
                charSequence.append(" has no target state");
                charSequence = charSequence.toString();
                object((String)charSequence);
                throw object;
            }
            case 6: {
                return i$b.DESTROYED;
            }
            case 5: {
                return i$b.RESUMED;
            }
            case 3: 
            case 4: {
                return i$b.STARTED;
            }
            case 1: 
            case 2: 
        }
        return i$b.CREATED;
    }
}

