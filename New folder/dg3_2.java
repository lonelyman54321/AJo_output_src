/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.Spinner
 *  android.widget.Switch
 *  android.widget.TimePicker
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from dg3
 */
public final class dg3_2 {
    public static final dg3_2 a;
    public static final List b;

    static {
        Object[] objectArray = new dg3_2();
        a = objectArray;
        objectArray = new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class};
        b = xx_2.i(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ArrayList a(View object) {
        Throwable throwable2;
        Class<dg3_2> clazz;
        block7: {
            Object object2;
            clazz = dg3_2.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return null;
            }
            ArrayList<View> arrayList = "view";
            try {
                boolean bl3;
                Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
                arrayList = new ArrayList<View>();
                object2 = b;
                object2 = object2.iterator();
                while (bl3 = object2.hasNext()) {
                    Object object3 = object2.next();
                    bl3 = ((Class)(object3 = (Class)object3)).isInstance(object);
                    if (!bl3) continue;
                    return arrayList;
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            boolean bl4 = object.isClickable();
            if (bl4) {
                arrayList.add((View)object);
            }
            object = xc3_0.b((View)object);
            object = ((ArrayList)object).iterator();
            while (true) {
                if (!(bl4 = object.hasNext())) {
                    return arrayList;
                }
                object2 = object.next();
                object2 = (View)object2;
                object2 = dg3_2.a((View)object2);
                arrayList.addAll((Collection<View>)object2);
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final JSONObject b(View object, View view) {
        Throwable throwable2;
        Class<dg3_2> clazz;
        block8: {
            boolean bl2;
            String string2;
            String string3;
            block7: {
                clazz = dg3_2.class;
                boolean bl3 = td0.b(clazz);
                if (bl3) {
                    return null;
                }
                string3 = "view";
                try {
                    Intrinsics.checkNotNullParameter(object, string3);
                    string3 = "clickedView";
                    Intrinsics.checkNotNullParameter(view, string3);
                    string3 = new JSONObject();
                    if (object != view) break block7;
                    string2 = "is_interacted";
                    bl2 = true;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                string3.put(string2, bl2);
            }
            dg3_2.e((View)object, (JSONObject)string3);
            string2 = new JSONArray();
            object = xc3_0.b((View)object);
            object = ((ArrayList)object).iterator();
            while (true) {
                if (!(bl2 = object.hasNext())) {
                    object = "childviews";
                    string3.put((String)object, (Object)string2);
                    return string3;
                }
                Object object2 = object.next();
                object2 = (View)object2;
                object2 = dg3_2.b(object2, view);
                string2.put(object2);
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final String d(View object) {
        Object object2;
        block8: {
            Class<dg3_2> clazz = dg3_2.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return null;
            }
            object2 = "hostView";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = xc3_0.j(object);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
                return null;
            }
            int n3 = ((String)object2).length();
            if (n3 <= 0) break block8;
            return object2;
        }
        object2 = a;
        object = ((dg3_2)object2).c((View)object);
        object2 = " ";
        object = TextUtils.join((CharSequence)object2, (Iterable)object);
        object2 = "join(\" \", childrenText)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    /*
     * Exception decompiling
     */
    public static final void e(View var0, JSONObject var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [21, 20 : 122->127)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList c(View object) {
        ArrayList<String> arrayList;
        block6: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return null;
            }
            try {
                arrayList = new ArrayList<String>();
                object = xc3_0.b((View)object);
                object = ((ArrayList)object).iterator();
                break block6;
            }
            catch (Throwable throwable) {}
            td0.a(this, throwable);
            return null;
        }
        boolean bl3;
        while (bl3 = object.hasNext()) {
            Object object2 = object.next();
            String string2 = xc3_0.j(object2 = (View)object2);
            int n3 = string2.length();
            if (n3 > 0) {
                arrayList.add(string2);
            }
            object2 = this.c((View)object2);
            arrayList.addAll((Collection<String>)object2);
        }
        return arrayList;
    }
}

