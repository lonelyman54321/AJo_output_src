/*
 * Decompiled with CFR 0.152.
 */
public final class CH$a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10 = CH$j.values().length;
        int[] nArray = new int[n10];
        b = nArray;
        int n14 = 1;
        try {
            object3 = CH$j.first_child;
            n8 = object3.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object3 = b;
            object2 = CH$j.last_child;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (CH$j)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object2 = b;
            enum_ = CH$j.only_child;
            n4 = enum_.ordinal();
            object2[n4] = (CH$j)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.first_of_type;
            n4 = enum_.ordinal();
            n3 = 4;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.last_of_type;
            n4 = enum_.ordinal();
            n3 = 5;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.only_of_type;
            n4 = enum_.ordinal();
            n3 = 6;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.root;
            n4 = enum_.ordinal();
            n3 = 7;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.empty;
            n4 = enum_.ordinal();
            n3 = 8;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.nth_child;
            n4 = enum_.ordinal();
            n3 = 9;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.nth_last_child;
            n4 = enum_.ordinal();
            n3 = 10;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.nth_of_type;
            n4 = enum_.ordinal();
            n3 = 11;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.nth_last_of_type;
            n4 = enum_.ordinal();
            n3 = 12;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.not;
            n4 = enum_.ordinal();
            n3 = 13;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.target;
            n4 = enum_.ordinal();
            n3 = 14;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.lang;
            n4 = enum_.ordinal();
            n3 = 15;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.link;
            n4 = enum_.ordinal();
            n3 = 16;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.visited;
            n4 = enum_.ordinal();
            n3 = 17;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.hover;
            n4 = enum_.ordinal();
            n3 = 18;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.active;
            n4 = enum_.ordinal();
            n3 = 19;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.focus;
            n4 = enum_.ordinal();
            n3 = 20;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.enabled;
            n4 = enum_.ordinal();
            n3 = 21;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.disabled;
            n4 = enum_.ordinal();
            n3 = 22;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.checked;
            n4 = enum_.ordinal();
            n3 = 23;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CH$j.indeterminate;
            n4 = enum_.ordinal();
            n3 = 24;
            object2[n4] = (CH$j)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = CH$c.values().length;
        object2 = new int[n7];
        a = (int[])object2;
        try {
            enum_ = CH$c.EQUALS;
            n4 = enum_.ordinal();
            object2[n4] = (CH$j)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = CH$c.INCLUDES;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)CH$c.DASHMATCH;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

