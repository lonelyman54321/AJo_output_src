/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kJ0
 */
public final class kj0_0 {
    public static final kj0_0 a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = hashMap = new HashMap();
    }

    public static final void a(kJ0$a kJ0$a, kJ0$b kJ0$b) {
        Intrinsics.checkNotNullParameter((Object)kJ0$b, "feature");
        Intrinsics.checkNotNullParameter(kJ0$a, "callback");
        lj0_0 lj0_02 = new lj0_0(kJ0$a, kJ0$b);
        zk0_1.c(lj0_02);
    }

    public static final boolean b(kJ0$b object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "feature");
        Object object3 = kJ0$b.Unknown;
        boolean bl2 = false;
        if (object3 == object) {
            return false;
        }
        object3 = kJ0$b.Core;
        boolean bl3 = true;
        if (object3 == object) {
            return bl3;
        }
        object3 = FacebookSdk.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0);
        String string2 = ((kJ0$b)((Object)object)).toKey();
        if ((object3 = object3.getString(string2, null)) != null && (object2 = Intrinsics.areEqual(object3, string2 = "18.0.2"))) {
            return false;
        }
        object3 = ((kJ0$b)((Object)object)).getParent();
        if (object3 == object) {
            object3 = kJ0$c.$EnumSwitchMapping$0;
            int n3 = ((Enum)object).ordinal();
            object2 = object3[n3];
            switch (object2 ? 1 : 0) {
                default: {
                    bl2 = true;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
            }
            object = ((kJ0$b)((Object)object)).toKey();
            object3 = FacebookSdk.b();
            bl2 = zk0_1.b((String)object, (String)object3, bl2);
        } else {
            object2 = kj0_0.b(object3);
            if (object2) {
                object3 = kJ0$c.$EnumSwitchMapping$0;
                int n4 = ((Enum)object).ordinal();
                object2 = object3[n4];
                switch (object2 ? 1 : 0) {
                    default: {
                        object2 = 1;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: {
                        object2 = 0;
                        object3 = null;
                    }
                }
                object = ((kJ0$b)((Object)object)).toKey();
                string2 = FacebookSdk.b();
                boolean bl4 = zk0_1.b((String)object, string2, object2);
                if (bl4) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

