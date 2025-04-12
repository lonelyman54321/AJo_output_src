/*
 * Decompiled with CFR 0.152.
 */
public final class CP2 {
    public final int a;

    public /* synthetic */ CP2(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof CP2;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (CP2)object;
            n3 = this.a;
            int n4 = ((CP2)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String string2 = null;
        int n3 = this.a;
        boolean bl2 = CP2.a(n3, 0);
        string2 = bl2 ? "Button" : ((bl2 = CP2.a(n3, 1)) ? "Checkbox" : ((bl2 = CP2.a(n3, 2)) ? "Switch" : ((bl2 = CP2.a(n3, 3)) ? "RadioButton" : ((bl2 = CP2.a(n3, 4)) ? "Tab" : ((bl2 = CP2.a(n3, 5)) ? "Image" : ((bl2 = CP2.a(n3, 6)) ? "DropdownList" : "Unknown"))))));
        return string2;
    }
}

