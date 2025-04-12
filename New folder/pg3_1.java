/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.WeakHashMap;

/*
 * Renamed from pg3
 */
public final class pg3_1
extends AK2
implements View.OnClickListener {
    public static final /* synthetic */ int x;
    public final SearchView k;
    public final SearchableInfo l;
    public final Context m;
    public final WeakHashMap n;
    public final int o;
    public int p;
    public ColorStateList q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public pg3_1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int n3;
        LayoutInflater layoutInflater;
        Object object;
        int n4;
        boolean bl2;
        int n7 = searchView.getSuggestionRowLayout();
        this.b = bl2 = true;
        this.c = null;
        this.a = false;
        this.d = n4 = -1;
        this.e = object = new gf0$a(this);
        super(this);
        this.f = object;
        this.i = n7;
        this.h = n7;
        this.j = layoutInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        this.p = (int)(bl2 ? 1 : 0);
        this.r = n4;
        this.s = n4;
        this.t = n4;
        this.u = n4;
        this.v = n4;
        this.w = n4;
        this.k = searchView;
        this.l = searchableInfo;
        this.o = n3 = searchView.getSuggestionCommitIconResId();
        this.m = context;
        this.n = weakHashMap;
    }

    public static String i(Cursor cursor, int n3) {
        int n4 = -1;
        if (n3 == n4) {
            return null;
        }
        try {
            return cursor.getString(n3);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(View view, Cursor cursor) {
        int n3;
        int n4;
        TextView textView;
        int n7;
        int n8;
        int n10;
        Object object;
        Object object2;
        Cursor cursor2;
        pg3_1 pg3_12;
        block29: {
            Object object3;
            block31: {
                Context context;
                block28: {
                    void var23_43;
                    String string2;
                    Object object4;
                    block35: {
                        block33: {
                            Drawable drawable2;
                            block34: {
                                ApplicationInfo applicationInfo;
                                ActivityInfo activityInfo;
                                TextAppearanceSpan textAppearanceSpan;
                                int n14;
                                block32: {
                                    int n15;
                                    block30: {
                                        int n16;
                                        pg3_12 = this;
                                        cursor2 = cursor;
                                        object = object2 = view.getTag();
                                        object = (pg3$a)object2;
                                        n10 = this.w;
                                        n8 = -1;
                                        n7 = n10 != n8 ? (n10 = cursor.getInt(n10)) : 0;
                                        textView = ((pg3$a)object).a;
                                        n4 = 8;
                                        if (textView != null) {
                                            n10 = pg3_12.r;
                                            object2 = pg3_1.i(cursor2, n10);
                                            textView.setText((CharSequence)object2);
                                            n10 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                                            if (n10 != 0) {
                                                textView.setVisibility(n4);
                                            } else {
                                                textView.setVisibility(0);
                                            }
                                        }
                                        n3 = 1;
                                        n14 = 2;
                                        context = pg3_12.m;
                                        object2 = ((pg3$a)object).b;
                                        if (object2 != null) {
                                            void var17_27;
                                            int n17 = pg3_12.t;
                                            object3 = pg3_1.i(cursor2, n17);
                                            if (object3 != null) {
                                                ColorStateList colorStateList = pg3_12.q;
                                                if (colorStateList == null) {
                                                    ColorStateList colorStateList2;
                                                    TypedValue typedValue = new TypedValue();
                                                    object4 = context.getTheme();
                                                    n15 = R$attr.textColorSearchUrl;
                                                    object4.resolveAttribute(n15, typedValue, n3 != 0);
                                                    object4 = context.getResources();
                                                    n16 = typedValue.resourceId;
                                                    pg3_12.q = colorStateList2 = object4.getColorStateList(n16);
                                                }
                                                SpannableString spannableString = new SpannableString((CharSequence)object3);
                                                ColorStateList colorStateList3 = pg3_12.q;
                                                object4 = textAppearanceSpan;
                                                TextAppearanceSpan textAppearanceSpan2 = textAppearanceSpan;
                                                n15 = 0;
                                                textAppearanceSpan = null;
                                                object4(null, 0, 0, colorStateList3, null);
                                                n17 = ((String)object3).length();
                                                int n18 = 33;
                                                spannableString.setSpan(object4, 0, n17, n18);
                                            } else {
                                                n8 = pg3_12.s;
                                                String string3 = pg3_1.i(cursor2, n8);
                                            }
                                            n8 = (int)(TextUtils.isEmpty((CharSequence)var17_27) ? 1 : 0);
                                            if (n8 != 0) {
                                                if (textView != null) {
                                                    textView.setSingleLine(false);
                                                    textView.setMaxLines(n14);
                                                }
                                            } else if (textView != null) {
                                                textView.setSingleLine(n3 != 0);
                                                textView.setMaxLines(n3);
                                            }
                                            object2.setText((CharSequence)var17_27);
                                            n8 = (int)(TextUtils.isEmpty((CharSequence)var17_27) ? 1 : 0);
                                            if (n8 != 0) {
                                                object2.setVisibility(n4);
                                            } else {
                                                object2.setVisibility(0);
                                            }
                                        }
                                        if ((object3 = ((pg3$a)object).c) == null) break block29;
                                        n10 = pg3_12.u;
                                        n16 = -1;
                                        if (n10 != n16) break block30;
                                        n10 = 0;
                                        object2 = null;
                                        break block31;
                                    }
                                    object2 = cursor2.getString(n10);
                                    if ((object2 = pg3_12.g((String)object2)) != null) break block31;
                                    object4 = pg3_12.n;
                                    object2 = pg3_12.l.getSearchActivity();
                                    string2 = object2.flattenToShortString();
                                    n15 = (int)(((WeakHashMap)object4).containsKey(string2) ? 1 : 0);
                                    if (n15 == 0) break block32;
                                    object2 = (Drawable.ConstantState)((WeakHashMap)object4).get(string2);
                                    if (object2 == null) {
                                        n10 = 0;
                                        object2 = null;
                                        break block28;
                                    } else {
                                        Resources resources = context.getResources();
                                        object2 = object2.newDrawable(resources);
                                    }
                                    break block28;
                                }
                                textAppearanceSpan = context.getPackageManager();
                                n8 = 128;
                                try {
                                    activityInfo = textAppearanceSpan.getActivityInfo((ComponentName)object2, n8);
                                }
                                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                    PackageManager.NameNotFoundException nameNotFoundException2 = nameNotFoundException;
                                    ((Object)((Object)nameNotFoundException)).toString();
                                }
                                n14 = activityInfo.getIconResource();
                                if (n14 == 0) break block33;
                                String string4 = object2.getPackageName();
                                drawable2 = textAppearanceSpan.getDrawable(string4, n14, applicationInfo = activityInfo.applicationInfo);
                                if (drawable2 != null) break block34;
                                object2.flattenToShortString();
                                break block33;
                            }
                            object2 = drawable2;
                            break block35;
                        }
                        n10 = 0;
                        object2 = null;
                    }
                    if (object2 == null) {
                        n8 = 0;
                        Object var23_41 = null;
                    } else {
                        Drawable.ConstantState constantState = object2.getConstantState();
                    }
                    ((WeakHashMap)object4).put(string2, var23_43);
                }
                if (object2 == null) {
                    object2 = context.getPackageManager().getDefaultActivityIcon();
                }
            }
            object3.setImageDrawable((Drawable)object2);
            if (object2 == null) {
                n10 = 4;
                object3.setVisibility(n10);
            } else {
                object3.setVisibility(0);
                object2.setVisible(false, false);
                object2.setVisible(n3 != 0, false);
            }
        }
        if ((object2 = ((pg3$a)object).d) != null) {
            void var23_47;
            n8 = pg3_12.v;
            n4 = -1;
            if (n8 == n4) {
                n8 = 0;
                Object var23_45 = null;
            } else {
                String string5 = cursor2.getString(n8);
                Drawable drawable3 = pg3_12.g(string5);
            }
            object2.setImageDrawable((Drawable)var23_47);
            if (var23_47 == null) {
                int n19 = 8;
                object2.setVisibility(n19);
            } else {
                object2.setVisibility(0);
                var23_47.setVisible(false, false);
                var23_47.setVisible(n3 != 0, false);
            }
        }
        n10 = pg3_12.p;
        ImageView imageView = ((pg3$a)object).e;
        int n20 = 2;
        if (n10 != n20 && (n10 != n3 || (n10 = n7 & 1) == 0)) {
            n20 = 8;
            imageView.setVisibility(n20);
            return;
        }
        imageView.setVisibility(0);
        object2 = textView.getText();
        imageView.setTag(object2);
        imageView.setOnClickListener((View.OnClickListener)pg3_12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Cursor cursor) {
        try {
            int n3;
            int n4;
            super.c(cursor);
            if (cursor == null) return;
            String string2 = "suggest_text_1";
            this.r = n4 = cursor.getColumnIndex(string2);
            string2 = "suggest_text_2";
            this.s = n4 = cursor.getColumnIndex(string2);
            string2 = "suggest_text_2_url";
            this.t = n4 = cursor.getColumnIndex(string2);
            string2 = "suggest_icon_1";
            this.u = n4 = cursor.getColumnIndex(string2);
            string2 = "suggest_icon_2";
            this.v = n4 = cursor.getColumnIndex(string2);
            string2 = "suggest_flags";
            this.w = n3 = cursor.getColumnIndex(string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final String d(Cursor object) {
        String string2;
        if (object == null) {
            return null;
        }
        int n3 = object.getColumnIndex("suggest_intent_query");
        String string3 = pg3_1.i(object, n3);
        if (string3 != null) {
            return string3;
        }
        string3 = this.l;
        int n4 = string3.shouldRewriteQueryFromData();
        if (n4 != 0 && (string2 = pg3_1.i(object, n4 = object.getColumnIndex("suggest_intent_data"))) != null) {
            return string2;
        }
        n3 = (int)(string3.shouldRewriteQueryFromText() ? 1 : 0);
        if (n3 != 0 && (object = pg3_1.i(object, n3 = object.getColumnIndex(string3 = "suggest_text_1"))) != null) {
            return object;
        }
        return null;
    }

    public final View e(ViewGroup viewGroup) {
        Object object = this.j;
        int n3 = this.h;
        viewGroup = object.inflate(n3, viewGroup, false);
        object = new pg3$a((View)viewGroup);
        viewGroup.setTag(object);
        int n4 = R$id.edit_query;
        object = (ImageView)viewGroup.findViewById(n4);
        n3 = this.o;
        object.setImageResource(n3);
        return viewGroup;
    }

    public final Drawable f(Uri object) {
        Object object2;
        block14: {
            block15: {
                block16: {
                    int n3;
                    int n4;
                    object2 = object.getAuthority();
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                    if (bl2) break block14;
                    Context context = this.m;
                    context = context.getPackageManager();
                    try {
                        context = context.getResourcesForApplication((String)object2);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        object = og3_1.a(object, "No package found for authority: ");
                        object2 = new FileNotFoundException((String)object);
                        throw object2;
                    }
                    Object object3 = object.getPathSegments();
                    if (object3 == null) break block15;
                    int n7 = object3.size();
                    if (n7 == (n4 = 1)) {
                        try {
                            object2 = object3.get(0);
                        }
                        catch (NumberFormatException numberFormatException) {
                            object = og3_1.a(object, "Single path segment is not a resource ID: ");
                            object2 = new FileNotFoundException((String)object);
                            throw object2;
                        }
                        object2 = (String)object2;
                        n3 = Integer.parseInt((String)object2);
                    }
                    int n8 = 2;
                    if (n7 != n8) break block16;
                    String string2 = (String)object3.get(n4);
                    object3 = (String)object3.get(0);
                    n3 = context.getIdentifier(string2, (String)object3, (String)object2);
                    if (n3 != 0) {
                        return context.getDrawable(n3);
                    }
                    object = og3_1.a(object, "No resource found for: ");
                    object2 = new FileNotFoundException((String)object);
                    throw object2;
                }
                object = og3_1.a(object, "More than two path segments: ");
                object2 = new FileNotFoundException((String)object);
                throw object2;
            }
            object = og3_1.a(object, "No path: ");
            object2 = new FileNotFoundException((String)object);
            throw object2;
        }
        object = og3_1.a(object, "No authority: ");
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }

    /*
     * Exception decompiling
     */
    public final Drawable g(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 15[TRYBLOCK] [32 : 288->291)] java.io.FileNotFoundException
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

    public final View getDropDownView(int n3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(n3, view, viewGroup);
        }
        catch (RuntimeException runtimeException) {
            int n4 = this.i;
            LayoutInflater layoutInflater = this.j;
            view = layoutInflater.inflate(n4, viewGroup, false);
            if (view != null) {
                viewGroup = ((pg3$a)view.getTag()).a;
                String string2 = ((Object)runtimeException).toString();
                viewGroup.setText((CharSequence)string2);
            }
            return view;
        }
    }

    public final View getView(int n3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(n3, view, viewGroup);
        }
        catch (RuntimeException runtimeException) {
            view = this.e(viewGroup);
            viewGroup = ((pg3$a)view.getTag()).a;
            String string2 = ((Object)runtimeException).toString();
            viewGroup.setText((CharSequence)string2);
            return view;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String string2) {
        String[] stringArray = null;
        if (searchableInfo == null) {
            return null;
        }
        String string3 = searchableInfo.getSuggestAuthority();
        if (string3 == null) {
            return null;
        }
        Object object = new Uri.Builder();
        String string4 = "content";
        string3 = object.scheme(string4).authority(string3);
        object = "";
        string3 = string3.query((String)object).fragment((String)object);
        object = searchableInfo.getSuggestPath();
        if (object != null) {
            string3.appendEncodedPath((String)object);
        }
        object = "search_suggest_query";
        string3.appendPath((String)object);
        String string5 = searchableInfo.getSuggestSelection();
        if (string5 != null) {
            stringArray = new String[1];
            searchableInfo = null;
            stringArray[0] = string2;
        } else {
            string3.appendPath(string2);
        }
        string2 = String.valueOf(50);
        string3.appendQueryParameter("limit", string2);
        Uri uri = string3.build();
        return this.m.getContentResolver().query(uri, null, string5, stringArray, null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Object object = this.c;
        object = object != null ? object.getExtras() : null;
        if (object != null) {
            String string2 = "in_progress";
            object.getBoolean(string2);
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Object object = this.c;
        object = object != null ? object.getExtras() : null;
        if (object != null) {
            String string2 = "in_progress";
            object.getBoolean(string2);
        }
    }

    public final void onClick(View object) {
        boolean bl2 = (object = object.getTag()) instanceof CharSequence;
        if (bl2) {
            SearchView searchView = this.k;
            object = (CharSequence)object;
            searchView.j((CharSequence)object);
        }
    }
}

