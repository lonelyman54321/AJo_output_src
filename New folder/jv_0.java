/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.ril.ajio.data.repo.HomeRepo;
import java.util.concurrent.Callable;

/*
 * Renamed from jV
 */
public final class jv_0
implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jv_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object call() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        a a2;
        Object object5;
        block24: {
            block28: {
                StringBuilder stringBuilder;
                block27: {
                    boolean bl2;
                    block26: {
                        block25: {
                            int n3 = this.a;
                            switch (n3) {
                                default: {
                                    return HomeRepo.C((HomeRepo)this.b);
                                }
                                case 0: 
                            }
                            object5 = "App Launched";
                            a2 = (a)this.b;
                            object4 = a2.b.o.d;
                            object3 = object4.b;
                            object2 = "local_events:";
                            bl2 = ((CleverTapInstanceConfig)object3).s;
                            if (!bl2) break block24;
                            bl2 = ((CleverTapInstanceConfig)object3).p;
                            if (bl2) break block25;
                            stringBuilder = new StringBuilder((String)object2);
                            object2 = ((CleverTapInstanceConfig)object3).a;
                            stringBuilder.append((String)object2);
                            object2 = stringBuilder.toString();
                            break block26;
                        }
                        object2 = "local_events";
                    }
                    stringBuilder = object4.c;
                    if (!bl2) break block27;
                    object4 = object4.j((String)object5);
                    object = gc3_0.f((Context)stringBuilder, (String)object2);
                    object4 = object.getString((String)object4, null);
                    if (object4 != null) break block28;
                    object4 = gc3_0.f((Context)stringBuilder, (String)object2);
                    object4 = object4.getString((String)object5, null);
                    break block28;
                }
                object4 = object4.j((String)object5);
                object2 = gc3_0.f((Context)stringBuilder, (String)object2);
                object4 = object2.getString((String)object4, null);
            }
            if (object4 == null) break block24;
            object2 = "\\|";
            object4 = object4.split((String)object2);
            int n4 = 0;
            object2 = null;
            object2 = object4[0];
            Integer.parseInt((String)object2);
            n4 = 1;
            object2 = object4[n4];
            Integer.parseInt((String)object2);
            n4 = 2;
            object4 = object4[n4];
            try {
                Integer.parseInt((String)object4);
            }
            catch (Throwable throwable) {
                object4 = ((CleverTapInstanceConfig)object3).b();
                object4.getClass();
                com.clevertap.android.sdk.b.m();
            }
        }
        object4 = a2.b.o.d;
        object3 = object4.g.f();
        object5 = object4.c((String)object5);
        object2 = object4.e;
        object4 = object4.c;
        ((Nh0)object2).c((Context)object4).p().d((String)object3, (String)object5);
        object5 = a2.b.c;
        object4 = ((mp0_0)object5).e;
        object2 = ((mp0_0)object5).d;
        boolean bl3 = gc3_0.a((Context)object4, (CleverTapInstanceConfig)object2, "NetworkInfo");
        object3 = ((CleverTapInstanceConfig)object2).b();
        object = new StringBuilder("Setting device network info reporting state from storage to ");
        ((StringBuilder)object).append(bl3);
        object = ((StringBuilder)object).toString();
        object2 = ((CleverTapInstanceConfig)object2).a;
        ((b)object3).b((String)object2, (String)object);
        ((mp0_0)object5).g = bl3;
        a2.b.c.l();
        return null;
    }
}

