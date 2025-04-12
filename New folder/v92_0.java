/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.NavImpl;

/*
 * Renamed from V92
 */
public final class v92_0
implements NavImpl {
    public final int a;
    public final String b;
    public final boolean c;
    public String d;

    public v92_0(int n3, String string2, boolean bl2) {
        this.a = n3;
        this.b = string2;
        this.c = bl2;
    }

    public final String getThisName() {
        return this.b;
    }

    public final String getThisParentName() {
        return null;
    }

    public final boolean isLeafNode() {
        return true;
    }
}

