/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oQ
 */
public final class oq_2
implements bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ oq_2(Object object) {
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object = (Function2)this.a;
        Object object2 = A83.c;
        synchronized (object2) {
            Object object3 = A83.h;
            object3 = (Iterable)object3;
            ArrayList arrayList = "<this>";
            Intrinsics.checkNotNullParameter(object3, (String)((Object)arrayList));
            int n3 = 10;
            n3 = yx_2.o((Iterable)object3, n3);
            arrayList = new ArrayList(n3);
            object3 = object3.iterator();
            n3 = 0;
            boolean bl2 = false;
            while (true) {
                boolean bl3;
                boolean bl4;
                if (!(bl4 = object3.hasNext())) {
                    A83.h = arrayList;
                    object = Unit.a;
                    return;
                }
                Object e2 = object3.next();
                boolean bl5 = true;
                if (!bl2 && (bl3 = Intrinsics.areEqual(e2, object))) {
                    bl2 = true;
                    bl5 = false;
                }
                if (!bl5) continue;
                arrayList.add(e2);
            }
        }
    }

    public Object apply(Object object) {
        CategoryNavigationRepo categoryNavigationRepo = (CategoryNavigationRepo)this.a;
        object = (Throwable)object;
        return CategoryNavigationRepo.b(categoryNavigationRepo, (Throwable)object);
    }
}

