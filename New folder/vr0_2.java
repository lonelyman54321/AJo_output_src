/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import com.ril.ajio.services.network.dnsresolver.DnsResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vr0
 */
public final class vr0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4 = Build.VERSION.SDK_INT;
                n3 = 23;
                object2 = (ni3_1)object2;
                if (n4 >= n3) {
                    ArrayList arrayList;
                    object2.getClass();
                    n3 = gh3_0.f;
                    Context context = ((ni3_1)object2).a;
                    int n7 = 34;
                    if (n4 >= n7) {
                        object = el1_0.b(context);
                        object.cancelAll();
                    }
                    if ((arrayList = gh3_0.f(context, (JobScheduler)(object = (JobScheduler)context.getSystemService("jobscheduler")))) != null && (n7 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0) {
                        Iterator iterator = arrayList.iterator();
                        while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                            JobInfo jobInfo = (JobInfo)iterator.next();
                            n7 = jobInfo.getId();
                            gh3_0.a((JobScheduler)object, n7);
                        }
                    }
                }
                object = ((ni3_1)object2).c;
                ((WorkDatabase)object).f().m();
                a a2 = ((ni3_1)object2).b;
                object2 = ((ni3_1)object2).e;
                rt2_0.b(a2, (WorkDatabase)object, (List)object2);
                return Unit.a;
            }
            case 3: {
                object2 = (Subcomponent)object2;
                if (object2 == null) return "";
                object = ((Subcomponent)object2).getMedia();
                if (object == null) return "";
                if ((object = ((Media)object).getUrl()) != null) return object;
                return "";
            }
            case 2: {
                object2 = (x32_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((Fragment)object2).getParentFragment();
                if (object == null) return null;
                Application application = ((Fragment)object2).requireActivity().getApplication();
                Object object3 = new w32(application, (x32_0)object2);
                object2 = new pw_2((Function0)object3);
                String string2 = "owner";
                Intrinsics.checkNotNullParameter(object, string2);
                object3 = "factory";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                rd3_0 rd3_02 = object.getViewModelStore();
                String string3 = "store";
                object = oh2_0.a((Fragment)object, string2, rd3_02, string3);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
                Class<F12> clazz = F12.class;
                object3 = "modelClass";
                object = on_2.c(rd3_02, (pw_2)object2, (Wd0)object, clazz, (String)object3);
                object2 = ef0_0.a(clazz, (String)object3, (String)object3, "<this>");
                String string4 = object2.getQualifiedName();
                if (string4 != null) {
                    object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    String string5 = ((String)object3).concat(string4);
                    return (F12)((pD3)object).a((yn1_2)object2, string5);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 1: {
                object2 = (ku1_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = oo2_0.a;
                object2 = ((ku1_2)object2).d.j0();
                object.getClass();
                return oo2_0.c("NET_BANKING", (PaymentInstruments)object2);
            }
            case 0: 
        }
        return DnsResolver.a((DnsResolver)object2);
    }
}

