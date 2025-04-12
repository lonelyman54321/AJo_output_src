/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.permission.CartData;
import com.ril.ajio.permission.PermissionData;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.permission.PopUpDialogModel;
import com.ril.ajio.permission.RatingsData;
import com.ril.ajio.permission.SessionsData;
import com.ril.ajio.permission.WishlistData;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lq2
 */
public final class lq2_1 {
    public static final lq2$a_0 Companion;
    public final WeakReference a;
    public final ArrayList b;
    public PermissionTrigger c;
    public Function1 d;
    public final PermissionData e;
    public final hh3_2 f;
    public final I3 g;
    public final I3 h;

    static {
        lq2$a_0 lq2$a_0;
        Companion = lq2$a_0 = new Object();
    }

    public lq2_1(WeakReference object) {
        this.a = object;
        Object object2 = new ArrayList();
        this.b = object2;
        this.d = object2 = new he0_2(2);
        object2 = h40_0.a;
        this.e = object2 = h40_0.E();
        object2 = new dq0_1(1);
        this.f = object2 = yr1_2.b((Function0)object2);
        object2 = (Fragment)((Reference)object).get();
        Object object3 = null;
        if (object2 != null) {
            e3_0 e3_02;
            jq2_1 jq2_12 = new jq2_1(this);
            object2 = ((Fragment)object2).registerForActivityResult(e3_02, jq2_12);
        } else {
            object2 = null;
        }
        this.g = object2;
        object = (Fragment)((Reference)object).get();
        if (object != null) {
            object2 = new x3();
            super();
            object3 = ((Fragment)object).registerForActivityResult((x3)object2, (w3)object3);
        }
        this.h = object3;
    }

    /*
     * Exception decompiling
     */
    public final void a(Function1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final jo_2 b() {
        return (jo_2)this.f.getValue();
    }

    public final PopUpDialogModel c(PermissionTrigger object, boolean bl2) {
        PopUpDialogModel popUpDialogModel = null;
        if (object == null) {
            return null;
        }
        object = ((PermissionTrigger)((Object)object)).getValue();
        String string2 = PermissionTrigger.WISHLIST.getValue();
        boolean bl3 = Intrinsics.areEqual(object, string2);
        PermissionData permissionData = this.e;
        if (bl3) {
            object = permissionData.getWishlist();
            if (bl2) {
                if (object != null) {
                    popUpDialogModel = ((WishlistData)object).getInAppPopUpDialogModel();
                }
            } else if (object != null) {
                popUpDialogModel = ((WishlistData)object).getSystemDialogModel();
            }
        } else {
            string2 = PermissionTrigger.CART.getValue();
            bl3 = Intrinsics.areEqual(object, string2);
            if (bl3) {
                object = permissionData.getCart();
                if (bl2) {
                    if (object != null) {
                        popUpDialogModel = ((CartData)object).getInAppPopUpDialogModel();
                    }
                } else if (object != null) {
                    popUpDialogModel = ((CartData)object).getSystemDialogModel();
                }
            } else {
                string2 = PermissionTrigger.RATINGS.getValue();
                bl3 = Intrinsics.areEqual(object, string2);
                if (bl3) {
                    object = permissionData.getRatings();
                    if (bl2) {
                        if (object != null) {
                            popUpDialogModel = ((RatingsData)object).getInAppPopUpDialogModel();
                        }
                    } else if (object != null) {
                        popUpDialogModel = ((RatingsData)object).getSystemDialogModel();
                    }
                } else {
                    string2 = PermissionTrigger.SESSIONS.getValue();
                    boolean bl4 = Intrinsics.areEqual(object, string2);
                    if (bl4) {
                        object = permissionData.getSessions();
                        if (bl2) {
                            if (object != null) {
                                popUpDialogModel = ((SessionsData)object).getInAppPopUpDialogModel();
                            }
                        } else if (object != null) {
                            popUpDialogModel = ((SessionsData)object).getSystemDialogModel();
                        }
                    }
                }
            }
        }
        return popUpDialogModel;
    }

    public final String[] d() {
        boolean bl2;
        String[] stringArray = this.b;
        ArrayList arrayList = new ArrayList();
        stringArray = stringArray.iterator();
        while (bl2 = stringArray.hasNext()) {
            Iterable iterable = tp_2.M(((iq2_1)stringArray.next()).a);
            cx_2.r(iterable, arrayList);
        }
        stringArray = new String[]{};
        return arrayList.toArray(stringArray);
    }

    public final void e() {
        Object object = h40_0.a;
        int n3 = h40_0.w1();
        if (n3 != 0) {
            object = this.b();
            int n4 = -1;
            String string2 = "NUMBER_OF_SESSIONS_FOR_DISPLAYING_NOTIFICATION";
            n3 = ((sw_0)object).getPreference(string2, n4);
            jo_2 jo_22 = this.b();
            jo_22.putPreference(string2, ++n3);
        }
    }

    public final void f(PermissionTrigger permissionTrigger) {
        Intrinsics.checkNotNullParameter((Object)permissionTrigger, "permissionTrigger");
        this.c = permissionTrigger;
    }

    public final void g(iq2_1 ... iq2_1Array) {
        Intrinsics.checkNotNullParameter(iq2_1Array, "permission");
        cx_2.t(this.b, iq2_1Array);
    }

    public final void h() {
        int n3;
        String[] stringArray = this.d();
        int n4 = eh1_2.c(stringArray.length);
        if (n4 < (n3 = 16)) {
            n4 = 16;
        }
        LinkedHashMap<String, Boolean> linkedHashMap = new LinkedHashMap<String, Boolean>(n4);
        for (String string2 : stringArray) {
            Boolean bl2 = Boolean.FALSE;
            linkedHashMap.put(string2, bl2);
        }
        this.i(linkedHashMap);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(Map object) {
        boolean bl2;
        Object object2;
        Object object3 = this.d;
        boolean bl3 = object.isEmpty();
        int n3 = 1;
        if (!bl3) {
            object = object.entrySet().iterator();
            while (bl3 = object.hasNext()) {
                object2 = (Boolean)((Map.Entry)object.next()).getValue();
                bl3 = (Boolean)object2;
                if (bl3) continue;
                bl2 = false;
                object = null;
                break;
            }
        } else {
            bl2 = true;
        }
        object = bl2;
        object3.invoke(object);
        object = (Fragment)this.a.get();
        if (object != null) {
            object3 = this.b();
            object2 = "NOTIFICATION_PERMISSION_COUNTER";
            int n4 = ((sw_0)object3).getPreference((String)object2, 0);
            bl2 = this.l((Fragment)object);
            if (!bl2 && n4 == n3) {
                object = this.b();
                ((sw_0)object).putPreference((String)object2, n4 += n3);
            }
        }
        this.b.clear();
        this.c = null;
        this.d = object = new le2_0(1);
    }

    public final void j() {
        Object object = this.b();
        int n3 = 1;
        ((sw_0)object).putPreference("NOTIFICATION_NUDGE_HAS_SHOWN_IN_CURRENT_SESSION", n3 != 0);
        object = this.c;
        Object object2 = PermissionTrigger.SESSIONS;
        jo_2 jo_22 = null;
        if (object == object2) {
            object = this.b();
            object2 = "NUMBER_OF_SESSIONS_FOR_DISPLAYING_NOTIFICATION";
            ((sw_0)object).putPreference((String)object2, 0);
        }
        object = this.b();
        object2 = new Date();
        long l2 = ((Date)object2).getTime();
        ((sw_0)object).putPreference("NOTIFICATION_PERMISSION_NUDGE_TIMESTAMP", l2);
        object = this.b();
        object2 = "NUMBER_OF_NUDGES_DISPLAYED_IN_D_DAYS";
        int n4 = ((sw_0)object).getPreference((String)object2, 0);
        jo_22 = this.b();
        jo_22.putPreference((String)object2, n4 += n3);
    }

    public final boolean k() {
        int n3;
        Object object;
        PermissionData permissionData = this.e;
        boolean n4 = permissionData.getMasterFlag();
        if (!n4) {
            return false;
        }
        Object object2 = this.b();
        boolean bl2 = ((sw_0)object2).getPreference((String)(object = "NOTIFICATION_NUDGE_HAS_SHOWN_IN_CURRENT_SESSION"), false);
        if (bl2) {
            return false;
        }
        object = this.b();
        long l2 = ((sw_0)object).getPreference("NOTIFICATION_PERMISSION_NUDGE_TIMESTAMP", 0L);
        object2 = new Date(l2);
        int n7 = permissionData.getMinGapInDaysToShowNudge();
        Calendar calendar = Calendar.getInstance();
        String string2 = "getInstance(...)";
        Intrinsics.checkNotNullExpressionValue(calendar, string2);
        calendar.setTime((Date)object2);
        calendar.add(5, n7);
        l2 = calendar.getTimeInMillis();
        object2 = new Date(l2);
        l2 = ((Date)object2).getTime();
        object2 = new Date();
        long l3 = ((Date)object2).getTime();
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 < 0) {
            return false;
        }
        object2 = this.b();
        int n8 = ((sw_0)object2).getPreference((String)(object = "NUMBER_OF_NUDGES_DISPLAYED_IN_D_DAYS"), 0);
        return n8 <= (n3 = permissionData.getMaxNumberOfNudgesInDDays());
    }

    public final boolean l(Fragment fragment) {
        Object object = this.b;
        boolean bl2 = object instanceof Collection;
        boolean bl3 = false;
        if (!bl2 || !(bl2 = ((ArrayList)object).isEmpty())) {
            object = ((ArrayList)object).iterator();
            block0: while (bl2 = object.hasNext()) {
                for (String string2 : ((iq2_1)object.next()).a) {
                    boolean bl4 = fragment.shouldShowRequestPermissionRationale(string2);
                    if (!bl4) continue;
                    bl3 = true;
                    break block0;
                }
            }
        }
        return bl3;
    }
}

