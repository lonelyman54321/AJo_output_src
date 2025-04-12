/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cK
 */
public final class ck_1
extends tf_0 {
    public WeakReference a;
    public final ArrayList b;
    public final CleverTapInstanceConfig c;
    public final mp0_0 d;
    public si0_0 e;
    public final ArrayList f;
    public final List g;
    public qx_1 h;

    public ck_1(CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02) {
        List list;
        this.b = list = new List();
        this.f = list = new List();
        list = new List();
        this.g = list = Collections.synchronizedList(list);
        this.c = cleverTapInstanceConfig;
        this.d = mp0_02;
    }
}

