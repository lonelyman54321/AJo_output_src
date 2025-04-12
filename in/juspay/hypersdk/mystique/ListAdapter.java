/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build$VERSION
 *  android.util.LruCache
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.core.Renderer;
import in.juspay.hypersdk.mystique.BitmapCache;
import in.juspay.hypersdk.mystique.ListAdapter$1;
import in.juspay.hypersdk.mystique.ListAdapter$Holder;
import org.json.JSONArray;
import org.json.JSONObject;

public class ListAdapter
extends BaseAdapter {
    private BitmapCache bitmapCache;
    private LruCache colorCache;
    private Context context;
    private float density;
    private LruCache drawableCache;
    private final DuiCallback duiCallback;
    private JSONArray holderData;
    private JSONObject itemView;
    private Renderer renderer;
    private JSONArray rowData;
    private LruCache typefaceCache;
    private LruCache typefaceWeightCache;

    public ListAdapter(Context context, Renderer object, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, DuiCallback duiCallback) {
        float f5;
        this.renderer = object;
        this.rowData = jSONArray2;
        this.itemView = jSONObject;
        this.holderData = jSONArray;
        this.duiCallback = duiCallback;
        this.bitmapCache = object = BitmapCache.getInstance();
        int n3 = 20;
        object = new LruCache(n3);
        this.colorCache = object;
        object = new LruCache(50);
        this.drawableCache = object;
        object = new LruCache(n3);
        this.typefaceCache = object;
        object = new LruCache(n3);
        this.typefaceWeightCache = object;
        this.context = context;
        this.density = f5 = context.getResources().getDisplayMetrics().density;
    }

    public static /* synthetic */ DuiCallback access$000(ListAdapter listAdapter) {
        return listAdapter.duiCallback;
    }

    public static /* synthetic */ JSONArray access$100(ListAdapter listAdapter) {
        return listAdapter.holderData;
    }

    /*
     * Exception decompiling
     */
    private void applyUpdate(View var1_1, JSONObject var2_2, JSONObject var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 225->230)] java.lang.Exception
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

    private View createView() {
        Renderer renderer;
        try {
            renderer = this.renderer;
        }
        catch (Exception exception) {
            return null;
        }
        JSONObject jSONObject = this.itemView;
        return renderer.createView(jSONObject);
    }

    private float[] getCorners(String[] stringArray) {
        int n3;
        int n4 = 8;
        float[] fArray = new float[n4];
        int n7 = 0;
        String string2 = stringArray[0];
        float f5 = Float.parseFloat(string2);
        for (int i3 = 1; i3 < (n3 = stringArray.length); ++i3) {
            String string3 = stringArray[i3];
            n3 = (int)(Boolean.parseBoolean(string3) ? 1 : 0);
            if (n3 != 0) {
                n3 = n7 + 1;
                fArray[n7] = f5;
                n7 += 2;
                fArray[n3] = f5;
                continue;
            }
            n7 += 2;
        }
        return fArray;
    }

    private String getDefault(String string2, String string3) {
        String string4 = "onClick";
        boolean bl2 = string2.equals(string4);
        if (bl2) {
            return string3;
        }
        return null;
    }

    private String getString(JSONObject jSONObject, String string2, String string3) {
        try {
            return jSONObject.getString(string2);
        }
        catch (Exception exception) {
            return string3;
        }
    }

    private void setAlpha(View view, String string2) {
        float f5 = Float.parseFloat(string2);
        view.setAlpha(f5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setBackground(View view, String string2) {
        Integer n3;
        block7: {
            int n4;
            block8: {
                int n7;
                if (string2 == null) {
                    string2 = view.getBackground();
                    boolean bl2 = string2 instanceof GradientDrawable;
                    boolean bl3 = false;
                    Object var5_7 = null;
                    if (bl2) {
                        string2 = (GradientDrawable)view.getBackground();
                        boolean bl4 = false;
                        Object var7_11 = null;
                        string2.setColor(0);
                    } else {
                        view.setBackgroundDrawable(null);
                    }
                    view.setBackgroundDrawable(null);
                    return;
                }
                n3 = (Integer)this.colorCache.get((Object)string2);
                if (n3 == null) {
                    int n8 = Color.parseColor((String)string2);
                    n3 = n8;
                    LruCache lruCache = this.colorCache;
                    lruCache.put((Object)string2, (Object)n3);
                }
                if ((string2 = view.getBackground()) == null) break block7;
                int n10 = string2 instanceof ColorDrawable;
                if (n10 == 0) break block8;
                String string3 = string2;
                ColorDrawable colorDrawable = (ColorDrawable)string2;
                n10 = colorDrawable.getColor();
                if (n10 != (n7 = n3.intValue())) break block7;
            }
            if ((n4 = string2 instanceof GradientDrawable) == 0) return;
            string2 = (GradientDrawable)string2;
            n4 = n3;
            string2.setColor(n4);
            return;
        }
        int n14 = n3;
        view.setBackgroundColor(n14);
    }

    private void setClickListener(View view, String string2, int n3) {
        ListAdapter$1 listAdapter$1 = new ListAdapter$1(this, string2, n3);
        view.setOnClickListener((View.OnClickListener)listAdapter$1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setCornerRadius(View view, String stringArray) {
        void var10_14;
        int n7;
        String string2;
        int n8;
        if (stringArray == null) return;
        stringArray = stringArray.split(",");
        int n3 = 8;
        float[] fArray = new float[n3];
        int n4 = stringArray.length;
        if (n4 <= 0) return;
        try {
            n4 = stringArray.length;
            n8 = 1;
            if (n4 == n8) {
                float f5;
                string2 = stringArray[0];
                fArray[0] = f5 = Float.parseFloat(string2);
            } else {
                fArray = this.getCorners(stringArray);
            }
        }
        catch (Exception exception) {
            return;
        }
        string2 = view.getBackground();
        boolean bl2 = string2 instanceof ColorDrawable;
        if (bl2) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            string2 = (ColorDrawable)string2;
            n4 = string2.getColor();
            gradientDrawable.setColor(n4);
            view.setBackground((Drawable)gradientDrawable);
        } else {
            n7 = string2 instanceof GradientDrawable;
            if (n7 != 0) {
                String string3 = string2;
                GradientDrawable gradientDrawable = (GradientDrawable)string2;
            } else {
                bl2 = false;
                Object var10_13 = null;
            }
        }
        if (var10_14 == null) return;
        n7 = stringArray.length;
        if (n7 == n8) {
            float f6 = fArray[0];
            var10_14.setCornerRadius(f6);
            return;
        }
        var10_14.setCornerRadii(fArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setFontStyle(View var1_1, String var2_4) {
        block21: {
            block32: {
                block26: {
                    block27: {
                        block30: {
                            block31: {
                                block29: {
                                    block28: {
                                        block25: {
                                            block23: {
                                                block24: {
                                                    block19: {
                                                        block20: {
                                                            var3_5 = "assets/";
                                                            var4_6 = "FONT_ERROR";
                                                            var5_7 = ",";
                                                            var6_8 = "fonts/";
                                                            var7_9 = var1_1 instanceof TextView;
                                                            if (var7_9 == 0) {
                                                                return;
                                                            }
                                                            try {
                                                                var1_1 = (TextView)var1_1;
                                                                var7_9 = var2_4.contains((CharSequence)var5_7);
                                                                var8_10 = this.typefaceWeightCache;
                                                                var8_10 = var8_10.get(var2_4);
                                                                var8_10 = (Integer)var8_10;
                                                                var9_11 /* !! */  = this.typefaceCache;
                                                                var9_11 /* !! */  = var9_11 /* !! */ .get(var2_4);
                                                                var9_11 /* !! */  = (Typeface)var9_11 /* !! */ ;
                                                                if (var9_11 /* !! */  == null) break block19;
                                                                var2_4 = var1_1.getTypeface();
                                                                if (var2_4 == var9_11 /* !! */ ) return;
                                                                if (var8_10 == null) break block20;
                                                            }
                                                            catch (Exception var1_2) {
                                                                break block21;
                                                            }
                                                            var10_12 = var8_10.intValue();
                                                            var1_1.setTypeface((Typeface)var9_11 /* !! */ , var10_12);
                                                            return;
                                                        }
                                                        var1_1.setTypeface((Typeface)var9_11 /* !! */ );
                                                        return;
                                                    }
                                                    if (var7_9 == 0) ** GOTO lbl158
                                                    var11_14 = ((String[])(var5_7 = var2_4.split((String)var5_7))).length;
                                                    if (var11_14 != (var7_9 = 2)) {
                                                        var1_1 = this.duiCallback;
                                                        var1_1 = var1_1.getLogger();
                                                        var2_4 = "incorrect font format recieved";
                                                        var1_1.e(var4_6, (String)var2_4);
                                                        return;
                                                    }
                                                    var11_14 = 0;
                                                    var6_8 = null;
                                                    var12_15 = var5_7[0];
                                                    var13_16 = 1;
                                                    var5_7 = var5_7[var13_16];
                                                    var14_17 = var12_15.hashCode();
                                                    var15_18 = 3433509;
                                                    var16_19 = -1;
                                                    if (var14_17 == var15_18) break block23;
                                                    var15_18 = 108403163;
                                                    if (var14_17 == var15_18) break block24;
                                                    var15_18 = 1544803905;
                                                    if (var14_17 != var15_18 || (var18_23 = (int)var12_15.equals(var17_20 = "default")) == 0) ** GOTO lbl-1000
                                                    var18_23 = 2;
                                                    break block25;
                                                }
                                                var17_21 = "resId";
                                                var18_23 = (int)var12_15.equals(var17_21);
                                                if (var18_23 == 0) ** GOTO lbl-1000
                                                var18_23 = 1;
                                                break block25;
                                            }
                                            var17_22 = "path";
                                            var18_23 = var12_15.equals(var17_22);
                                            if (var18_23 != 0) {
                                                var18_23 = 0;
                                                var12_15 = null;
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                var18_23 = -1;
                                            }
                                        }
                                        var14_17 = 26;
                                        if (var18_23 == 0) break block26;
                                        if (var18_23 == var13_16) break block27;
                                        if (var18_23 != var7_9) ** GOTO lbl169
                                        var19_24 = var5_7.hashCode();
                                        if (var19_24 == (var18_23 = 3029637)) break block28;
                                        var18_23 = 1086463900;
                                        if (var19_24 != var18_23) {
                                            var18_23 = 1222907667;
                                            if (var19_24 == var18_23 && (var19_24 = (int)var5_7.equals(var3_5 = "semiBold")) != 0) {
                                                var16_19 = 2;
                                            }
                                            break block29;
                                        } else {
                                            var3_5 = "regular";
                                            var19_24 = (int)var5_7.equals(var3_5);
                                            if (var19_24 != 0) {
                                                var16_19 = 0;
                                            }
                                        }
                                        break block29;
                                    }
                                    var3_5 = "bold";
                                    var19_24 = (int)var5_7.equals(var3_5);
                                    if (var19_24 != 0) {
                                        var16_19 = 1;
                                    }
                                }
                                var3_5 = "sans-serif";
                                if (var16_19 == 0) break block30;
                                if (var16_19 == var13_16) break block31;
                                if (var16_19 != var7_9) ** GOTO lbl169
                                var8_10 = 0;
                                var3_5 = "sans-serif-medium";
                                var3_5 = Typeface.create((String)var3_5, (int)0);
                                ** GOTO lbl155
                            }
                            var8_10 = var13_16;
                            var3_5 = Typeface.create((String)var3_5, (int)var13_16);
                            ** GOTO lbl155
                        }
                        var8_10 = 0;
                        var3_5 = Typeface.create((String)var3_5, (int)0);
                        ** GOTO lbl155
                    }
                    var19_25 = Integer.parseInt((String)var5_7);
                    var20_27 = Build.VERSION.SDK_INT;
                    if (var20_27 >= var14_17) {
                        var5_7 = this.context;
                        var5_7 = var5_7.getResources();
                        var3_5 = uu1_2.a((Resources)var5_7, var19_25);
                    } else {
                        var5_7 = this.context;
                        var5_7 = var5_7.getApplicationContext();
                        var3_5 = WK2.c(var19_25, (Context)var5_7);
                    }
                    ** GOTO lbl155
                }
                var7_9 = (int)var5_7.contains((CharSequence)var3_5);
                if (var7_9 == 0) break block32;
                var6_8 = "";
                var3_5 = var5_7.replace((CharSequence)var3_5, var6_8);
                var5_7 = this.context;
                var5_7 = var5_7.getAssets();
                var3_5 = Typeface.createFromAsset((AssetManager)var5_7, (String)var3_5);
                ** GOTO lbl155
            }
            var3_5 = "res/";
            var19_26 = var5_7.contains((CharSequence)var3_5);
            if (var19_26 == 0) ** GOTO lbl169
            var3_5 = "/";
            var3_5 = var5_7.split((String)var3_5);
            var20_28 = ((Typeface)var3_5).length - var13_16;
            {
                block22: {
                    var3_5 = var3_5[var20_28];
                    var5_7 = "\\.";
                    var3_5 = var3_5.split((String)var5_7);
                    var3_5 = var3_5[0];
                    var5_7 = this.context;
                    var5_7 = var5_7.getResources();
                    var6_8 = "font";
                    var21_29 /* !! */  = this.context;
                    var21_29 /* !! */  = var21_29 /* !! */ .getPackageName();
                    var19_26 = var5_7.getIdentifier((String)var3_5, var6_8, (String)var21_29 /* !! */ );
                    var20_28 = Build.VERSION.SDK_INT;
                    if (var20_28 >= var14_17) {
                        var5_7 = this.context;
                        var5_7 = var5_7.getResources();
                        var3_5 = uu1_2.a((Resources)var5_7, var19_26);
                    } else {
                        var5_7 = this.context;
                        var5_7 = var5_7.getApplicationContext();
                        var3_5 = WK2.c(var19_26, (Context)var5_7);
                    }
lbl155:
                    // 9 sources

                    while (true) {
                        var9_11 /* !! */  = var3_5;
                        break block22;
                        break;
                    }
lbl158:
                    // 1 sources

                    var3_5 = this.context;
                    var3_5 = var3_5.getAssets();
                    var5_7 = new StringBuilder(var6_8);
                    var5_7.append((String)var2_4);
                    var6_8 = ".ttf";
                    var5_7.append(var6_8);
                    var5_7 = var5_7.toString();
                    var3_5 = Typeface.createFromAsset((AssetManager)var3_5, (String)var5_7);
                    ** continue;
                }
                var3_5 = this.typefaceCache;
                var3_5.put(var2_4, (Object)var9_11 /* !! */ );
                if (var8_10 != null) {
                    var3_5 = this.typefaceWeightCache;
                    var3_5.put(var2_4, var8_10);
                    var10_13 = var8_10.intValue();
                    var1_1.setTypeface((Typeface)var9_11 /* !! */ , var10_13);
                    return;
                }
                var1_1.setTypeface((Typeface)var9_11 /* !! */ );
                return;
            }
        }
        var2_4 = this.duiCallback.getLogger();
        var1_3 = var1_2.toString();
        var2_4.e(var4_6, var1_3);
    }

    /*
     * Exception decompiling
     */
    private void setImage(View var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Nonsensical loop would be emitted - failure
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:438)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
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

    private void setPackageIcon(View view, String string2) {
        view = (ImageView)view;
        PackageManager packageManager = this.context.getPackageManager();
        string2 = packageManager.getApplicationInfo(string2, 0).loadIcon(packageManager);
        view.setImageDrawable((Drawable)string2);
    }

    private void setText(View view, String string2) {
        CharSequence charSequence;
        boolean bl2 = view instanceof TextView;
        if (bl2 && !(bl2 = (charSequence = (view = (TextView)view).getText()).equals(string2))) {
            view.setText((CharSequence)string2);
        }
    }

    private void setTextColor(View view, String string2) {
        int n3 = view instanceof TextView;
        if (n3 == 0) {
            return;
        }
        if (string2 == null) {
            view = (TextView)view;
            int n4 = -16777216;
            view.setTextColor(n4);
        } else {
            Integer n7 = (Integer)this.colorCache.get((Object)string2);
            if (n7 == null) {
                n3 = Color.parseColor((String)string2);
                n7 = n3;
                LruCache lruCache = this.colorCache;
                lruCache.put((Object)string2, (Object)n7);
            }
            view = (TextView)view;
            int n8 = n7;
            view.setTextColor(n8);
        }
    }

    private void setTextSize(View view, String string2) {
        Object object = view instanceof TextView;
        if (!object) {
            return;
        }
        int n3 = Integer.parseInt(string2);
        float f5 = n3;
        float f6 = this.density;
        f5 *= f6;
        f6 = (view = (TextView)view).getTextSize();
        float f7 = f6 - f5;
        object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object) {
            object = false;
            f6 = 0.0f;
            view.setTextSize(0, f5);
        }
    }

    private void setVisibility(View view, String string2) {
        int n3;
        String string3 = "gone";
        boolean bl2 = string2.equalsIgnoreCase(string3);
        if (bl2) {
            n3 = 8;
        } else {
            string3 = "invisible";
            n3 = (int)(string2.equalsIgnoreCase(string3) ? 1 : 0);
            if (n3 != 0) {
                n3 = 4;
            } else {
                n3 = 0;
                string2 = null;
            }
        }
        view.setVisibility(n3);
    }

    private void updateView(View object, int n3) {
        View view;
        int n4;
        Object object2 = object.getTag();
        if (object2 == null) {
            return;
        }
        object = (ListAdapter$Holder)object.getTag();
        object2 = null;
        for (int i3 = 0; i3 < (n4 = ((View[])(view = object.views)).length); ++i3) {
            if ((view = view[i3]) == null) continue;
            JSONObject jSONObject = this.rowData.getJSONObject(n3);
            JSONObject jSONObject2 = this.holderData.getJSONObject(i3);
            this.applyUpdate(view, jSONObject2, jSONObject, n3);
        }
    }

    public int getCount() {
        return this.rowData.length();
    }

    public Object getItem(int n3) {
        return null;
    }

    public long getItemId(int n3) {
        return 0L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public View getView(int n3, View view, ViewGroup object) {
        if (view == null) {
            view = this.createView();
            if (view == null) {
                view = this.context;
                return new View((Context)view);
            }
            ListAdapter$Holder listAdapter$Holder = new ListAdapter$Holder(this, view);
            view.setTag((Object)listAdapter$Holder);
        }
        try {
            this.updateView(view, n3);
            return view;
        }
        catch (Exception exception) {
            return view;
        }
    }

    public void updateRowData(JSONArray jSONArray) {
        this.rowData = jSONArray;
    }
}

