/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from AT1
 */
public final class at1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Context c;

    public at1_1(Context context) {
        this.c = context;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        block7: {
            boolean bl2;
            Object object3;
            block8: {
                boolean bl3;
                Object object4;
                Parcelable parcelable;
                int n3;
                Object object5;
                object = (Bundle)object;
                object2 = CT1.a(this.c);
                if (object == null) break block7;
                object3 = ((e)object2).a.getClassLoader();
                object.setClassLoader((ClassLoader)object3);
                object3 = object.getBundle("android-support-nav:controller:navigatorState");
                ((e)object2).d = object3;
                object3 = object.getParcelableArray("android-support-nav:controller:backStack");
                ((e)object2).e = object3;
                object3 = ((e)object2).n;
                ((LinkedHashMap)object3).clear();
                Object object6 = object.getIntArray("android-support-nav:controller:backStackDestIds");
                Object object7 = object.getStringArrayList("android-support-nav:controller:backStackIds");
                if (object6 != null && object7 != null) {
                    int n4 = ((int[])object6).length;
                    object5 = null;
                    n3 = 0;
                    parcelable = null;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        Object object8 = object6[i3];
                        int n7 = n3 + 1;
                        object4 = (int)object8;
                        LinkedHashMap linkedHashMap = ((e)object2).m;
                        parcelable = (Parcelable)((ArrayList)object7).get(n3);
                        linkedHashMap.put(object4, parcelable);
                        n3 = n7;
                    }
                }
                if ((object6 = (Object)object.getStringArrayList("android-support-nav:controller:backStackStates")) == null) break block8;
                object6 = object6.iterator();
                while (bl3 = object6.hasNext()) {
                    block11: {
                        Object object9;
                        block10: {
                            block9: {
                                object7 = (String)object6.next();
                                object5 = "android-support-nav:controller:backStackStates:";
                                object9 = new StringBuilder((String)object5);
                                ((StringBuilder)object9).append((String)object7);
                                object9 = ((StringBuilder)object9).toString();
                                if ((object9 = object.getParcelableArray((String)object9)) == null) continue;
                                Intrinsics.checkNotNullExpressionValue(object7, "id");
                                n3 = ((Parcelable[])object9).length;
                                object5 = new e1_0();
                                if (n3 != 0) break block9;
                                parcelable = fp_2.e;
                                break block10;
                            }
                            if (n3 <= 0) break block11;
                            parcelable = new Object[n3];
                        }
                        ((fp_2)object5).b = parcelable;
                        object9 = ArrayIteratorKt.iterator((Object[])object9);
                        while ((n3 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                            parcelable = (Parcelable)object9.next();
                            object4 = "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState";
                            Intrinsics.checkNotNull(parcelable, (String)object4);
                            parcelable = (NavBackStackEntryState)parcelable;
                            ((fp_2)object5).addLast(parcelable);
                        }
                        object3.put(object7, object5);
                        continue;
                    }
                    object2 = hj0_0.a(n3, "Illegal Capacity: ");
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
            }
            object3 = "android-support-nav:controller:deepLinkHandled";
            ((e)object2).f = bl2 = object.getBoolean((String)object3);
        }
        return object2;
    }
}

