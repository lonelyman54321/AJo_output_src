/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.style.ImageSpan
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.TouchDelegate
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.AutoCompleteTextView
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView$OnEditorActionListener
 */
package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView$SavedState;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.SearchView$a;
import androidx.appcompat.widget.SearchView$b;
import androidx.appcompat.widget.SearchView$c;
import androidx.appcompat.widget.SearchView$d;
import androidx.appcompat.widget.SearchView$e;
import androidx.appcompat.widget.SearchView$f;
import androidx.appcompat.widget.SearchView$g;
import androidx.appcompat.widget.SearchView$h;
import androidx.appcompat.widget.SearchView$i;
import androidx.appcompat.widget.SearchView$j;
import androidx.appcompat.widget.SearchView$k;
import androidx.appcompat.widget.SearchView$l;
import androidx.appcompat.widget.SearchView$m;
import androidx.appcompat.widget.SearchView$n;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView
extends LinearLayoutCompat
implements lx_0 {
    public static final SearchView$m Q;
    public gf0_0 A;
    public boolean B;
    public CharSequence C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public String H;
    public CharSequence I;
    public boolean J;
    public int K;
    public SearchableInfo L;
    public Bundle M;
    public final Runnable N;
    public final Runnable O;
    public final WeakHashMap P;
    public final SearchView$SearchAutoComplete a;
    public final View b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final View i;
    public SearchView$n j;
    public final Rect k;
    public final Rect l;
    public final int[] m;
    public final int[] n;
    public final ImageView o;
    public final Drawable p;
    public final int q;
    public final int r;
    public final Intent s;
    public final Intent t;
    public final CharSequence u;
    public SearchView$k v;
    public View.OnFocusChangeListener w;
    public View.OnClickListener x;
    public boolean y;
    public boolean z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2 = true;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        Object object = null;
        if (n3 < n4) {
            Object object2 = AutoCompleteTextView.class;
            SearchView$m searchView$m = new Object();
            searchView$m.a = null;
            searchView$m.b = null;
            searchView$m.c = null;
            SearchView$m.a();
            Class[] classArray = "doBeforeTextChanged";
            try {
                classArray = ((Class)object2).getDeclaredMethod((String)classArray, null);
                searchView$m.a = classArray;
                classArray.setAccessible(bl2);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            classArray = "doAfterTextChanged";
            try {
                object = ((Class)object2).getDeclaredMethod((String)classArray, null);
                searchView$m.b = object;
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            object = "ensureImeVisible";
            try {
                Class<Boolean> clazz;
                classArray = new Class[bl2];
                classArray[0] = clazz = Boolean.TYPE;
                searchView$m.c = object2 = ((Class)object2).getMethod((String)object, classArray);
                ((AccessibleObject)object2).setAccessible(bl2);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            object = searchView$m;
        }
        Q = object;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.searchViewStyle;
        this(context, attributeSet, n3);
    }

    public SearchView(Context context, AttributeSet attributeSet, int n3) {
        ImageView imageView;
        SearchView searchView = this;
        super(context, attributeSet, n3);
        Object object = new Rect();
        this.k = object;
        object = new Rect();
        this.l = object;
        int bl2 = 2;
        Object object2 = new int[bl2];
        this.m = object2;
        object = new int[bl2];
        this.n = (int[])object;
        super(this);
        this.N = object;
        super(this);
        this.O = object;
        super();
        this.P = object;
        SearchView$d searchView$d = new SearchView$d(this);
        SearchView$e searchView$e = new SearchView$e(this);
        SearchView$f searchView$f = new SearchView$f(this);
        SearchView$g searchView$g = new SearchView$g(this);
        SearchView$h searchView$h = new SearchView$h(this);
        SearchView$a searchView$a = new SearchView$a(this);
        object = R$styleable.SearchView;
        Context context2 = context;
        Object object3 = attributeSet;
        int n4 = n3;
        Tn3 tn3 = Tn3.f(context, attributeSet, (int[])object, n3, 0);
        Object object4 = R$styleable.SearchView;
        Object object5 = tn3.b;
        object = this;
        object2 = context;
        Tn3 tn32 = tn3;
        ViewCompat.r((View)this, context, object4, attributeSet, object5, n3, 0);
        object = LayoutInflater.from((Context)context);
        int n7 = R$styleable.SearchView_layout;
        int n8 = R$layout.abc_search_view;
        object3 = tn3.b;
        n7 = object3.getResourceId(n7, n8);
        object.inflate(n7, (ViewGroup)this, true);
        int n10 = R$id.search_src_text;
        object = (SearchView$SearchAutoComplete)this.findViewById(n10);
        this.a = object;
        ((SearchView$SearchAutoComplete)object).setSearchView(this);
        n7 = R$id.search_edit_frame;
        object2 = this.findViewById(n7);
        this.b = (View)object2;
        n7 = R$id.search_plate;
        object2 = this.findViewById(n7);
        this.c = (View)object2;
        int n14 = R$id.submit_area;
        object5 = this.findViewById(n14);
        this.d = object5;
        n4 = R$id.search_button;
        this.e = imageView = (ImageView)this.findViewById(n4);
        int n15 = R$id.search_go_btn;
        tn3 = (ImageView)this.findViewById(n15);
        this.f = tn3;
        int n16 = R$id.search_close_btn;
        context2 = (ImageView)this.findViewById(n16);
        this.g = context2;
        n8 = R$id.search_voice_btn;
        object4 = (ImageView)this.findViewById(n8);
        this.h = (ImageView)object4;
        SearchView$e searchView$e2 = searchView$e;
        int n17 = R$id.search_mag_icon;
        searchView$e = (ImageView)this.findViewById(n17);
        this.o = searchView$e;
        SearchView$h searchView$h2 = searchView$h;
        int n18 = R$styleable.SearchView_queryBackground;
        searchView$h = tn32.b(n18);
        object2.setBackground((Drawable)searchView$h);
        n7 = R$styleable.SearchView_submitBackground;
        object2 = tn32.b(n7);
        object5.setBackground((Drawable)object2);
        n7 = R$styleable.SearchView_searchIcon;
        object2 = tn32.b(n7);
        imageView.setImageDrawable((Drawable)object2);
        n7 = R$styleable.SearchView_goIcon;
        object2 = tn32.b(n7);
        tn3.setImageDrawable((Drawable)object2);
        n7 = R$styleable.SearchView_closeIcon;
        object2 = tn32.b(n7);
        context2.setImageDrawable((Drawable)object2);
        n7 = R$styleable.SearchView_voiceIcon;
        object2 = tn32.b(n7);
        object4.setImageDrawable((Drawable)object2);
        n7 = R$styleable.SearchView_searchIcon;
        object2 = tn32.b(n7);
        searchView$e.setImageDrawable((Drawable)object2);
        n7 = R$styleable.SearchView_searchHintIcon;
        object2 = tn32.b(n7);
        this.p = (Drawable)object2;
        object2 = this.getResources();
        n14 = R$string.abc_searchview_description_search;
        object2 = object2.getString(n14);
        vo3_0.a((View)imageView, (CharSequence)object2);
        n7 = R$styleable.SearchView_suggestionRowLayout;
        n14 = R$layout.abc_search_dropdown_item_icons_2line;
        n7 = object3.getResourceId(n7, n14);
        this.q = n7;
        n7 = R$styleable.SearchView_commitIcon;
        n14 = 0;
        object5 = null;
        n7 = object3.getResourceId(n7, 0);
        this.r = n7;
        imageView.setOnClickListener((View.OnClickListener)searchView$d);
        context2.setOnClickListener((View.OnClickListener)searchView$d);
        tn3.setOnClickListener(searchView$d);
        object4.setOnClickListener((View.OnClickListener)searchView$d);
        object.setOnClickListener((View.OnClickListener)searchView$d);
        object.addTextChangedListener((TextWatcher)searchView$a);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)searchView$f);
        object.setOnItemClickListener((AdapterView.OnItemClickListener)searchView$g);
        object2 = searchView$h2;
        object.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)searchView$h2);
        object2 = searchView$e2;
        object.setOnKeyListener((View.OnKeyListener)searchView$e2);
        object2 = new SearchView$b;
        super(this);
        object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
        n7 = R$styleable.SearchView_iconifiedByDefault;
        n7 = (int)(object3.getBoolean(n7, true) ? 1 : 0);
        this.setIconifiedByDefault(n7 != 0);
        n7 = R$styleable.SearchView_android_maxWidth;
        n8 = -1;
        n7 = object3.getDimensionPixelSize(n7, n8);
        if (n7 != n8) {
            this.setMaxWidth(n7);
        }
        n7 = R$styleable.SearchView_defaultQueryHint;
        object2 = object3.getText(n7);
        searchView.u = object2;
        n7 = R$styleable.SearchView_queryHint;
        object2 = object3.getText(n7);
        searchView.C = object2;
        n7 = R$styleable.SearchView_android_imeOptions;
        if ((n7 = object3.getInt(n7, n8)) != n8) {
            searchView.setImeOptions(n7);
        }
        n7 = R$styleable.SearchView_android_inputType;
        if ((n7 = object3.getInt(n7, n8)) != n8) {
            searchView.setInputType(n7);
        }
        n7 = R$styleable.SearchView_android_focusable;
        n7 = (int)(object3.getBoolean(n7, true) ? 1 : 0);
        searchView.setFocusable(n7 != 0);
        tn32.g();
        object2 = new Intent;
        object4 = "android.speech.action.WEB_SEARCH";
        super((String)object4);
        searchView.s = (Intent)object2;
        n8 = 0x10000000;
        object2.addFlags(n8);
        object5 = "web_search";
        object2.putExtra("android.speech.extra.LANGUAGE_MODEL", (String)object5);
        object2 = new Intent;
        object3 = "android.speech.action.RECOGNIZE_SPEECH";
        super((String)object3);
        searchView.t = (Intent)object2;
        object2.addFlags(n8);
        int n19 = object.getDropDownAnchor();
        object = searchView.findViewById(n19);
        searchView.i = object;
        if (object != null) {
            object2 = new SearchView$c;
            super(searchView);
            object.addOnLayoutChangeListener((View.OnLayoutChangeListener)object2);
        }
        boolean bl3 = searchView.y;
        searchView.q(bl3);
        this.n();
    }

    private int getPreferredHeight() {
        Resources resources = this.getContext().getResources();
        int n3 = R$dimen.abc_search_view_preferred_height;
        return resources.getDimensionPixelSize(n3);
    }

    private int getPreferredWidth() {
        Resources resources = this.getContext().getResources();
        int n3 = R$dimen.abc_search_view_preferred_width;
        return resources.getDimensionPixelSize(n3);
    }

    private void setQuery(CharSequence charSequence) {
        int n3;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        searchView$SearchAutoComplete.setText(charSequence);
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            n3 = 0;
            charSequence = null;
        } else {
            n3 = charSequence.length();
        }
        searchView$SearchAutoComplete.setSelection(n3);
    }

    public final void a() {
        int n3;
        boolean bl2 = this.J;
        if (bl2) {
            return;
        }
        this.J = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        this.K = n3 = searchView$SearchAutoComplete.getImeOptions();
        searchView$SearchAutoComplete.setImeOptions(n3 |= 0x2000000);
        searchView$SearchAutoComplete.setText("");
        this.setIconified(false);
    }

    public final void c() {
        this.setQuery("", false);
        this.clearFocus();
        this.q(true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        int n3 = this.K;
        searchView$SearchAutoComplete.setImeOptions(n3);
        this.J = false;
    }

    public final void clearFocus() {
        this.E = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.E = false;
    }

    public final Intent d(Uri object, String charSequence, String string2, String string3) {
        Intent intent = new Intent(charSequence);
        int n3 = 0x10000000;
        intent.addFlags(n3);
        if (object != null) {
            intent.setData(object);
        }
        object = "user_query";
        charSequence = this.I;
        intent.putExtra((String)object, charSequence);
        if (string3 != null) {
            object = "query";
            intent.putExtra((String)object, string3);
        }
        if (string2 != null) {
            object = "intent_extra_data_key";
            intent.putExtra((String)object, string2);
        }
        if ((object = this.M) != null) {
            charSequence = "app_data";
            intent.putExtra(charSequence, (Bundle)object);
        }
        object = this.L.getSearchActivity();
        intent.setComponent((ComponentName)object);
        return intent;
    }

    public final Intent e(Intent object, SearchableInfo searchableInfo) {
        String string2;
        String string3;
        ComponentName componentName = searchableInfo.getSearchActivity();
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setComponent(componentName);
        Context context = this.getContext();
        int n3 = 0x42000000;
        intent = PendingIntent.getActivity((Context)context, (int)0, (Intent)intent, (int)n3);
        context = new Bundle();
        Bundle bundle = this.M;
        if (bundle != null) {
            string3 = "app_data";
            context.putParcelable(string3, (Parcelable)bundle);
        }
        bundle = new Intent(object);
        object = this.getResources();
        n3 = searchableInfo.getVoiceLanguageModeId();
        if (n3 != 0) {
            n3 = searchableInfo.getVoiceLanguageModeId();
            string3 = object.getString(n3);
        } else {
            string3 = "free_form";
        }
        int n4 = searchableInfo.getVoicePromptTextId();
        String string4 = null;
        if (n4 != 0) {
            n4 = searchableInfo.getVoicePromptTextId();
            string2 = object.getString(n4);
        } else {
            n4 = 0;
            string2 = null;
        }
        int n7 = searchableInfo.getVoiceLanguageId();
        if (n7 != 0) {
            n7 = searchableInfo.getVoiceLanguageId();
            object = object.getString(n7);
        } else {
            object = null;
        }
        n7 = searchableInfo.getVoiceMaxResults();
        int n8 = n7 != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        String string5 = "android.speech.extra.LANGUAGE_MODEL";
        bundle.putExtra(string5, string3);
        bundle.putExtra("android.speech.extra.PROMPT", string2);
        string3 = "android.speech.extra.LANGUAGE";
        bundle.putExtra(string3, (String)object);
        object = "android.speech.extra.MAX_RESULTS";
        bundle.putExtra((String)object, n8);
        if (componentName != null) {
            string4 = componentName.flattenToShortString();
        }
        bundle.putExtra("calling_package", string4);
        bundle.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)intent);
        bundle.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", (Bundle)context);
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        if (n3 >= n4) {
            SearchView$i.a(searchView$SearchAutoComplete);
            return;
        }
        Object object = Q;
        object.getClass();
        SearchView$m.a();
        n4 = 0;
        Method method = ((SearchView$m)object).a;
        if (method != null) {
            try {
                method.invoke((Object)searchView$SearchAutoComplete, null);
            }
            catch (Exception exception) {}
        }
        object.getClass();
        SearchView$m.a();
        object = ((SearchView$m)object).b;
        if (object == null) return;
        try {
            ((Method)object).invoke((Object)searchView$SearchAutoComplete, null);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        Object object = searchView$SearchAutoComplete.getText();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = true;
        if (bl2) {
            boolean bl4 = this.y;
            if (bl4) {
                this.clearFocus();
                this.q(bl3);
            }
        } else {
            object = "";
            searchView$SearchAutoComplete.setText((CharSequence)object);
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(bl3);
        }
    }

    public int getImeOptions() {
        return this.a.getImeOptions();
    }

    public int getInputType() {
        return this.a.getInputType();
    }

    public int getMaxWidth() {
        return this.F;
    }

    public CharSequence getQuery() {
        return this.a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.C;
        if (charSequence == null) {
            int n3;
            charSequence = this.L;
            if (charSequence != null && (n3 = charSequence.getHintId()) != 0) {
                charSequence = this.getContext();
                SearchableInfo searchableInfo = this.L;
                int n4 = searchableInfo.getHintId();
                charSequence = charSequence.getText(n4);
            } else {
                charSequence = this.u;
            }
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.r;
    }

    public int getSuggestionRowLayout() {
        return this.q;
    }

    public gf0_0 getSuggestionsAdapter() {
        return this.A;
    }

    public final void h(int n3) {
        Object object = this.A.c;
        if (object != null && (n3 = (int)(object.moveToPosition(n3) ? 1 : 0)) != 0) {
            CharSequence charSequence;
            int n4;
            String string2;
            int n7;
            String string3;
            String string4;
            Object object2;
            block36: {
                block35: {
                    block34: {
                        n3 = 0;
                        object2 = null;
                        int n8 = pg3_1.x;
                        string4 = "suggest_intent_action";
                        n8 = object.getColumnIndex(string4);
                        string4 = pg3_1.i((Cursor)object, n8);
                        if (string4 != null) break block34;
                        string4 = this.L;
                        string4 = string4.getSuggestIntentAction();
                    }
                    if (string4 == null) {
                        string4 = "android.intent.action.SEARCH";
                    }
                    string3 = "suggest_intent_data";
                    n7 = object.getColumnIndex(string3);
                    string3 = pg3_1.i((Cursor)object, n7);
                    if (string3 != null) break block35;
                    string3 = this.L;
                    string3 = string3.getSuggestIntentData();
                }
                if (string3 != null) {
                    string2 = "suggest_intent_data_id";
                    n4 = object.getColumnIndex(string2);
                    string2 = pg3_1.i((Cursor)object, n4);
                    if (string2 == null) break block36;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string3);
                    string3 = "/";
                    ((StringBuilder)charSequence).append(string3);
                    string3 = Uri.encode((String)string2);
                    ((StringBuilder)charSequence).append(string3);
                    string3 = ((StringBuilder)charSequence).toString();
                }
            }
            if (string3 == null) {
                n7 = 0;
                string3 = null;
            } else {
                string3 = Uri.parse((String)string3);
            }
            string2 = "suggest_intent_query";
            n4 = object.getColumnIndex(string2);
            string2 = pg3_1.i((Cursor)object, n4);
            charSequence = "suggest_intent_extra_data";
            int n10 = object.getColumnIndex((String)charSequence);
            charSequence = pg3_1.i((Cursor)object, n10);
            try {
                object2 = this.d((Uri)string3, string4, (String)charSequence, string2);
            }
            catch (RuntimeException runtimeException) {
                try {
                    object.getPosition();
                }
                catch (RuntimeException runtimeException2) {}
            }
            if (object2 != null) {
                object = this.getContext();
                try {
                    object.startActivity((Intent)object2);
                }
                catch (RuntimeException runtimeException) {
                    object2.toString();
                }
            }
        }
        object = this.a;
        ((SearchView$SearchAutoComplete)object).setImeVisibility(false);
        object.dismissDropDown();
    }

    public final void i(int n3) {
        Editable editable = this.a.getText();
        Cursor cursor = this.A.c;
        if (cursor != null) {
            if ((n3 = (int)(cursor.moveToPosition(n3) ? 1 : 0)) != 0) {
                String string2 = this.A.d(cursor);
                if (string2 != null) {
                    this.setQuery(string2);
                } else {
                    this.setQuery((CharSequence)editable);
                }
            } else {
                this.setQuery((CharSequence)editable);
            }
        }
    }

    public final void j(CharSequence charSequence) {
        this.setQuery(charSequence);
    }

    public final void k() {
        String string2;
        SearchView$k searchView$k;
        int n3;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        Object object = searchView$SearchAutoComplete.getText();
        if (object != null && (n3 = TextUtils.getTrimmedLength((CharSequence)object)) > 0 && ((searchView$k = this.v) == null || (n3 = (int)(searchView$k.L1(string2 = object.toString()) ? 1 : 0)) == 0)) {
            searchView$k = this.L;
            if (searchView$k != null) {
                object = object.toString();
                n3 = 0;
                string2 = "android.intent.action.SEARCH";
                object = this.d(null, string2, null, (String)object);
                searchView$k = this.getContext();
                searchView$k.startActivity((Intent)object);
            }
            object = null;
            searchView$SearchAutoComplete.setImeVisibility(false);
            searchView$SearchAutoComplete.dismissDropDown();
        }
    }

    public final void l() {
        ImageView imageView;
        boolean bl2;
        Object object = this.a.getText();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        boolean bl4 = true;
        int n3 = 0;
        if (!((bl3 ^= bl4) || (bl2 = this.y) && !(bl2 = this.J))) {
            bl4 = false;
            imageView = null;
        }
        if (!bl4) {
            n3 = 8;
        }
        imageView = this.g;
        imageView.setVisibility(n3);
        imageView = imageView.getDrawable();
        if (imageView != null) {
            object = bl3 ? (Object)ViewGroup.ENABLED_STATE_SET : (Object)ViewGroup.EMPTY_STATE_SET;
            imageView.setState((int[])object);
        }
    }

    public final void m() {
        Object object = this.a;
        boolean bl2 = object.hasFocus();
        object = bl2 ? (Object)ViewGroup.FOCUSED_STATE_SET : (Object)ViewGroup.EMPTY_STATE_SET;
        Drawable drawable2 = this.c.getBackground();
        if (drawable2 != null) {
            drawable2.setState((int[])object);
        }
        if ((drawable2 = this.d.getBackground()) != null) {
            drawable2.setState((int[])object);
        }
        this.invalidate();
    }

    public final void n() {
        Drawable drawable2;
        CharSequence charSequence = this.getQueryHint();
        if (charSequence == null) {
            charSequence = "";
        }
        int n3 = this.y;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        if (n3 != 0 && (drawable2 = this.p) != null) {
            float f5 = searchView$SearchAutoComplete.getTextSize();
            double d2 = f5;
            double d5 = 1.25;
            int n4 = (int)(d2 *= d5);
            drawable2.setBounds(0, 0, n4, n4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
            ImageSpan imageSpan = new ImageSpan(drawable2);
            n3 = 33;
            int n7 = 1;
            int n8 = 2;
            spannableStringBuilder.setSpan((Object)imageSpan, n7, n8, n3);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(charSequence);
    }

    public final void o() {
        ImageView imageView;
        int n3 = this.B;
        if (!(n3 == 0 && (n3 = this.G) == 0 || (n3 = this.z) != 0 || (n3 = (imageView = this.f).getVisibility()) != 0 && (n3 = (imageView = this.h).getVisibility()) != 0)) {
            n3 = 0;
            imageView = null;
        } else {
            n3 = 8;
        }
        this.d.setVisibility(n3);
    }

    public final void onDetachedFromWindow() {
        Runnable runnable2 = this.N;
        this.removeCallbacks(runnable2);
        runnable2 = this.O;
        this.post(runnable2);
        super.onDetachedFromWindow();
    }

    /*
     * WARNING - void declaration
     */
    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_8;
        int n10;
        int n14;
        void var2_5;
        super.onLayout(bl2, (int)var2_5, n14, n10, (int)var5_8);
        if (bl2) {
            Object object = this.m;
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
            searchView$SearchAutoComplete.getLocationInWindow((int[])object);
            int[] nArray = this.n;
            this.getLocationInWindow(nArray);
            int n15 = 1;
            int n16 = object[n15];
            n15 = nArray[n15];
            n16 -= n15;
            n15 = 0;
            int n17 = object[0];
            n10 = nArray[0];
            int n18 = n17 - n10;
            n10 = searchView$SearchAutoComplete.getWidth() + n18;
            int n19 = searchView$SearchAutoComplete.getHeight() + n16;
            Rect rect = this.k;
            rect.set(n18, n16, n10, n19);
            int n20 = rect.left;
            n10 = rect.right;
            Rect rect2 = this.l;
            rect2.set(n20, 0, n10, (int)(var5_8 -= n14));
            object = (Object)this.j;
            if (object == null) {
                object = (Object)new SearchView$n;
                object((View)searchView$SearchAutoComplete, rect2, rect);
                this.j = (SearchView$n)((Object)object);
                this.setTouchDelegate((TouchDelegate)object);
            } else {
                object.b.set(rect2);
                searchView$SearchAutoComplete = object.d;
                searchView$SearchAutoComplete.set(rect2);
                n14 = -object.e;
                searchView$SearchAutoComplete.inset(n14, n14);
                object = object.c;
                object.set(rect);
            }
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7 = this.z;
        if (n7 != 0) {
            super.onMeasure(n3, n4);
            return;
        }
        n7 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n8 = -1 << -1;
        int n10 = 0x40000000;
        if (n7 != n8) {
            if (n7 != 0) {
                if (n7 == n10 && (n7 = this.F) > 0) {
                    n3 = Math.min(n7, n3);
                }
            } else {
                n3 = this.F;
                if (n3 <= 0) {
                    n3 = this.getPreferredWidth();
                }
            }
        } else {
            n7 = this.F;
            if (n7 > 0) {
                n3 = Math.min(n7, n3);
            } else {
                n7 = this.getPreferredWidth();
                n3 = Math.min(n7, n3);
            }
        }
        n7 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        if (n7 != n8) {
            if (n7 == 0) {
                n4 = this.getPreferredHeight();
            }
        } else {
            n7 = this.getPreferredHeight();
            n4 = Math.min(n7, n4);
        }
        n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n10);
        n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n10);
        super.onMeasure(n3, n4);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof SearchView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SearchView$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        boolean bl3 = parcelable.a;
        this.q(bl3);
        this.requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        boolean bl2;
        Parcelable parcelable = super.onSaveInstanceState();
        SearchView$SavedState searchView$SavedState = new AbsSavedState(parcelable);
        searchView$SavedState.a = bl2 = this.z;
        return searchView$SavedState;
    }

    public final void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        Runnable runnable2 = this.N;
        this.post(runnable2);
    }

    public final void p(boolean n3) {
        boolean bl2 = this.B;
        n3 = !(!bl2 || !bl2 && !(bl2 = this.G) || (bl2 = this.z) || !(bl2 = this.hasFocus()) || n3 == 0 && (n3 = this.G) != 0) ? 0 : 8;
        this.f.setVisibility(n3);
    }

    /*
     * WARNING - void declaration
     */
    public final void q(boolean bl2) {
        boolean bl3;
        void var1_4;
        ImageView imageView;
        Drawable drawable2;
        int n3;
        this.z = bl2;
        int n4 = 8;
        if (bl2) {
            n3 = 0;
            drawable2 = null;
        } else {
            n3 = 8;
        }
        Editable editable = this.a.getText();
        boolean bl4 = TextUtils.isEmpty((CharSequence)editable);
        boolean bl5 = bl4 ^ true;
        ImageView imageView2 = this.e;
        imageView2.setVisibility(n3);
        this.p(bl5);
        if (bl2) {
            int n7 = 8;
        } else {
            boolean bl6 = false;
            imageView = null;
        }
        this.b.setVisibility((int)var1_4);
        imageView = this.o;
        drawable2 = imageView.getDrawable();
        if (drawable2 != null && (n3 = (int)(this.y ? 1 : 0)) == 0) {
            n3 = 0;
            drawable2 = null;
        } else {
            n3 = 8;
        }
        imageView.setVisibility(n3);
        this.l();
        boolean bl7 = this.G;
        if (bl7 && !(bl3 = this.z) && bl4) {
            imageView = this.f;
            imageView.setVisibility(n4);
            n4 = 0;
        }
        this.h.setVisibility(n4);
        this.o();
    }

    public final boolean requestFocus(int n3, Rect rect) {
        boolean bl2 = this.E;
        if (bl2) {
            return false;
        }
        bl2 = this.isFocusable();
        if (!bl2) {
            return false;
        }
        bl2 = this.z;
        if (!bl2) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
            if ((n3 = (int)(searchView$SearchAutoComplete.requestFocus(n3, rect) ? 1 : 0)) != 0) {
                this.q(false);
            }
            return n3 != 0;
        }
        return super.requestFocus(n3, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.M = bundle;
    }

    public void setIconified(boolean bl2) {
        if (bl2) {
            this.g();
        } else {
            bl2 = false;
            this.q(false);
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
            searchView$SearchAutoComplete.requestFocus();
            boolean bl3 = true;
            searchView$SearchAutoComplete.setImeVisibility(bl3);
            searchView$SearchAutoComplete = this.x;
            if (searchView$SearchAutoComplete != null) {
                searchView$SearchAutoComplete.onClick((View)this);
            }
        }
    }

    public void setIconifiedByDefault(boolean bl2) {
        boolean bl3 = this.y;
        if (bl3 == bl2) {
            return;
        }
        this.y = bl2;
        this.q(bl2);
        this.n();
    }

    public void setImeOptions(int n3) {
        this.a.setImeOptions(n3);
    }

    public void setInputType(int n3) {
        this.a.setInputType(n3);
    }

    public void setMaxWidth(int n3) {
        this.F = n3;
        this.requestLayout();
    }

    public void setOnCloseListener(SearchView$j searchView$j) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.w = onFocusChangeListener;
    }

    public void setOnQueryTextListener(SearchView$k searchView$k) {
        this.v = searchView$k;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.x = onClickListener;
    }

    public void setOnSuggestionListener(SearchView$l searchView$l) {
    }

    public void setQuery(CharSequence charSequence, boolean bl2) {
        boolean bl3;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        searchView$SearchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            int n3 = searchView$SearchAutoComplete.length();
            searchView$SearchAutoComplete.setSelection(n3);
            this.I = charSequence;
        }
        if (bl2 && !(bl3 = TextUtils.isEmpty((CharSequence)charSequence))) {
            this.k();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.C = charSequence;
        this.n();
    }

    /*
     * WARNING - void declaration
     */
    public void setQueryRefinementEnabled(boolean bl2) {
        this.D = bl2;
        gf0_0 gf0_02 = this.A;
        boolean bl3 = gf0_02 instanceof pg3_1;
        if (bl3) {
            void var1_4;
            gf0_02 = (pg3_1)gf0_02;
            if (bl2) {
                int n3 = 2;
            } else {
                boolean bl4 = true;
            }
            ((pg3_1)gf0_02).p = var1_4;
        }
    }

    public void setSearchableInfo(SearchableInfo object) {
        String string2;
        int n3;
        int n4;
        this.L = object;
        Intent intent = null;
        int n7 = 1;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        if (object != null) {
            n4 = object.getSuggestThreshold();
            searchView$SearchAutoComplete.setThreshold(n4);
            n4 = this.L.getImeOptions();
            searchView$SearchAutoComplete.setImeOptions(n4);
            object = this.L;
            n4 = object.getInputType();
            n3 = n4 & 0xF;
            if (n3 == n7) {
                n3 = -65537;
                n4 &= n3;
                string2 = this.L.getSuggestAuthority();
                if (string2 != null) {
                    n3 = 589824;
                    n4 |= n3;
                }
            }
            searchView$SearchAutoComplete.setInputType(n4);
            object = this.A;
            if (object != null) {
                ((gf0_0)object).c(null);
            }
            if ((object = this.L.getSuggestAuthority()) != null) {
                string2 = this.getContext();
                SearchableInfo searchableInfo = this.L;
                WeakHashMap weakHashMap = this.P;
                this.A = object = new pg3_1((Context)string2, this, searchableInfo, weakHashMap);
                searchView$SearchAutoComplete.setAdapter((ListAdapter)object);
                object = (pg3_1)this.A;
                n3 = (int)(this.D ? 1 : 0);
                n3 = n3 != 0 ? 2 : 1;
                ((pg3_1)object).p = n3;
            }
            this.n();
        }
        object = this.L;
        n3 = 0;
        string2 = null;
        if (object != null && (n4 = (int)(object.getVoiceSearchEnabled() ? 1 : 0)) != 0) {
            object = this.L;
            n4 = (int)(object.getVoiceSearchLaunchWebSearch() ? 1 : 0);
            if (n4 != 0) {
                intent = this.s;
            } else {
                object = this.L;
                n4 = (int)(object.getVoiceSearchLaunchRecognizer() ? 1 : 0);
                if (n4 != 0) {
                    intent = this.t;
                }
            }
            if (intent != null) {
                object = this.getContext().getPackageManager();
                int n8 = 65536;
                if ((object = object.resolveActivity(intent, n8)) == null) {
                    n7 = 0;
                }
                n3 = n7;
            }
        }
        this.G = n3;
        if (n3 != 0) {
            object = "nm";
            searchView$SearchAutoComplete.setPrivateImeOptions((String)object);
        }
        n4 = (int)(this.z ? 1 : 0);
        this.q(n4 != 0);
    }

    public void setSubmitButtonEnabled(boolean bl2) {
        this.B = bl2;
        bl2 = this.z;
        this.q(bl2);
    }

    public void setSuggestionsAdapter(gf0_0 gf0_02) {
        this.A = gf0_02;
        this.a.setAdapter((ListAdapter)gf0_02);
    }
}

