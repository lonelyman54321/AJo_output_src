/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List hierarchyFactories;
    private final Map instanceCreators;
    private boolean lenient;
    private LongSerializationPolicy longSerializationPolicy;
    private ToNumberStrategy numberToNumberStrategy;
    private ToNumberStrategy objectToNumberStrategy;
    private boolean prettyPrinting;
    private final LinkedList reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        int n3;
        String string2;
        Object object;
        this.excluder = object = Excluder.DEFAULT;
        object = LongSerializationPolicy.DEFAULT;
        this.longSerializationPolicy = object;
        object = FieldNamingPolicy.IDENTITY;
        this.fieldNamingPolicy = object;
        this.instanceCreators = object;
        super();
        this.factories = object;
        super();
        this.hierarchyFactories = object;
        this.serializeNulls = false;
        this.datePattern = string2 = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = n3 = 2;
        this.timeStyle = n3;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        n3 = 1;
        this.escapeHtmlChars = n3;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = n3;
        object = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.objectToNumberStrategy = object;
        object = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = object;
        super();
        this.reflectionFilters = object;
    }

    public GsonBuilder(Gson object) {
        int n3;
        int n4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object object2;
        this.excluder = object2 = Excluder.DEFAULT;
        object2 = LongSerializationPolicy.DEFAULT;
        this.longSerializationPolicy = object2;
        object2 = FieldNamingPolicy.IDENTITY;
        this.fieldNamingPolicy = object2;
        this.instanceCreators = object2;
        this.factories = arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList = new ArrayList();
        this.serializeNulls = false;
        Object object3 = Gson.DEFAULT_DATE_PATTERN;
        this.datePattern = object3;
        this.dateStyle = n4 = 2;
        this.timeStyle = n4;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        n4 = 1;
        this.escapeHtmlChars = n4;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = n4;
        LinkedList linkedList = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.objectToNumberStrategy = linkedList;
        linkedList = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = linkedList;
        this.reflectionFilters = linkedList = new LinkedList();
        this.excluder = object3 = ((Gson)object).excluder;
        this.fieldNamingPolicy = object3 = ((Gson)object).fieldNamingStrategy;
        object3 = ((Gson)object).instanceCreators;
        object2.putAll(object3);
        this.serializeNulls = n3 = ((Gson)object).serializeNulls;
        this.complexMapKeySerialization = n3 = ((Gson)object).complexMapKeySerialization;
        this.generateNonExecutableJson = n3 = ((Gson)object).generateNonExecutableJson;
        this.escapeHtmlChars = n3 = ((Gson)object).htmlSafe;
        this.prettyPrinting = n3 = ((Gson)object).prettyPrinting;
        this.lenient = n3 = ((Gson)object).lenient;
        this.serializeSpecialFloatingPointValues = n3 = ((Gson)object).serializeSpecialFloatingPointValues;
        object2 = ((Gson)object).longSerializationPolicy;
        this.longSerializationPolicy = object2;
        object2 = ((Gson)object).datePattern;
        this.datePattern = object2;
        this.dateStyle = n3 = ((Gson)object).dateStyle;
        this.timeStyle = n3 = ((Gson)object).timeStyle;
        object2 = ((Gson)object).builderFactories;
        arrayList2.addAll(object2);
        object2 = ((Gson)object).builderHierarchyFactories;
        arrayList.addAll(object2);
        n3 = (int)(((Gson)object).useJdkUnsafe ? 1 : 0);
        this.useJdkUnsafe = n3;
        object2 = ((Gson)object).objectToNumberStrategy;
        this.objectToNumberStrategy = object2;
        object2 = ((Gson)object).numberToNumberStrategy;
        this.numberToNumberStrategy = object2;
        object = ((Gson)object).reflectionFilters;
        linkedList.addAll(object);
    }

    /*
     * Unable to fully structure code
     */
    private void addTypeAdaptersForDate(String var1_1, int var2_2, int var3_3, List var4_4) {
        block8: {
            block5: {
                block6: {
                    block7: {
                        var5_5 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
                        var6_6 = null;
                        if (var1_1 == null || (var8_8 = (var7_7 = var1_1.trim()).isEmpty())) break block6;
                        var9_9 = DefaultDateTypeAdapter$DateType.DATE.createAdapterFactory((String)var1_1);
                        if (!var5_5) break block7;
                        var6_6 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory((String)var1_1);
                        var10_10 = SqlTypesSupport.DATE_DATE_TYPE;
                        var1_1 = var10_10.createAdapterFactory((String)var1_1);
                        break block5;
                    }
lbl11:
                    // 2 sources

                    while (true) {
                        var11_11 = 0;
                        var1_1 = null;
                        break block5;
                        break;
                    }
                }
                var11_11 = 2;
                if (var2_2 != var11_11 && var3_3 != var11_11) {
                    var1_1 = DefaultDateTypeAdapter$DateType.DATE.createAdapterFactory(var2_2, var3_3);
                    if (var5_5) {
                        var6_6 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(var2_2, var3_3);
                        var7_7 = SqlTypesSupport.DATE_DATE_TYPE;
                        var12_12 = var7_7.createAdapterFactory(var2_2, var3_3);
                        var9_9 = var1_1;
                        var1_1 = var12_12;
                    } else {
                        var9_9 = var1_1;
                        ** continue;
                    }
                }
                break block8;
            }
            var4_4.add(var9_9);
            if (var5_5) {
                var4_4.add(var6_6);
                var4_4.add(var1_1);
            }
        }
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy object) {
        Objects.requireNonNull(object);
        this.excluder = object = this.excluder.withExclusionStrategy((ExclusionStrategy)object, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
        Objects.requireNonNull(reflectionAccessFilter);
        this.reflectionFilters.addFirst(reflectionAccessFilter);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy object) {
        Objects.requireNonNull(object);
        this.excluder = object = this.excluder.withExclusionStrategy((ExclusionStrategy)object, true, false);
        return this;
    }

    public Gson create() {
        Gson gson;
        Object object;
        ArrayList arrayList = object;
        int n3 = this.factories.size();
        int n4 = this.hierarchyFactories.size() + n3 + 3;
        object = new ArrayList(n4);
        Object object2 = this.factories;
        ((ArrayList)object).addAll(object2);
        Collections.reverse(object);
        Object object3 = this.hierarchyFactories;
        object2 = new ArrayList(object3);
        Collections.reverse(object2);
        ((ArrayList)object).addAll(object2);
        object2 = this.datePattern;
        n4 = this.dateStyle;
        int n7 = this.timeStyle;
        this.addTypeAdaptersForDate((String)object2, n4, n7, (List)object);
        object = gson;
        object2 = this.excluder;
        object3 = this.fieldNamingPolicy;
        Map map2 = this.instanceCreators;
        HashMap hashMap = new HashMap(map2);
        boolean bl2 = this.serializeNulls;
        boolean bl3 = this.complexMapKeySerialization;
        boolean bl4 = this.generateNonExecutableJson;
        boolean bl5 = this.escapeHtmlChars;
        boolean bl6 = this.prettyPrinting;
        boolean bl7 = this.lenient;
        boolean bl8 = this.serializeSpecialFloatingPointValues;
        boolean bl9 = this.useJdkUnsafe;
        LongSerializationPolicy longSerializationPolicy = this.longSerializationPolicy;
        String string2 = this.datePattern;
        int n8 = this.dateStyle;
        int n10 = this.timeStyle;
        ArrayList arrayList2 = object;
        Object object4 = object2;
        object2 = this.factories;
        object = new ArrayList(object2);
        ArrayList arrayList3 = object;
        object2 = this.hierarchyFactories;
        object = new ArrayList(object2);
        ToNumberStrategy toNumberStrategy = this.objectToNumberStrategy;
        ToNumberStrategy toNumberStrategy2 = this.numberToNumberStrategy;
        ArrayList arrayList4 = object;
        object2 = this.reflectionFilters;
        object = new ArrayList(object2);
        object = gson;
        object2 = object4;
        gson = new Gson((Excluder)object4, (FieldNamingStrategy)object3, hashMap, bl2, bl3, bl4, bl5, bl6, bl7, bl8, bl9, longSerializationPolicy, string2, n8, n10, arrayList2, arrayList3, arrayList, toNumberStrategy, toNumberStrategy2, arrayList4);
        return gson;
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        Excluder excluder;
        this.excluder = excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int ... object) {
        Objects.requireNonNull(object);
        object = this.excluder.withModifiers((int)object);
        this.excluder = object;
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluder;
        this.excluder = excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type object, Object object2) {
        Object object3;
        boolean bl2;
        Objects.requireNonNull(object);
        boolean bl3 = object2 instanceof JsonSerializer;
        if (!(bl3 || (bl2 = object2 instanceof JsonDeserializer) || (bl2 = object2 instanceof InstanceCreator) || (bl2 = object2 instanceof TypeAdapter))) {
            bl2 = false;
            object3 = null;
        } else {
            bl2 = true;
        }
        $Gson$Preconditions.checkArgument(bl2);
        bl2 = object2 instanceof InstanceCreator;
        if (bl2) {
            object3 = this.instanceCreators;
            Object object4 = object2;
            object4 = (InstanceCreator)object2;
            object3.put(object, object4);
        }
        if (bl3 || (bl3 = object2 instanceof JsonDeserializer)) {
            Object object5 = TypeToken.get((Type)object);
            object3 = this.factories;
            object5 = TreeTypeAdapter.newFactoryWithMatchRawType((TypeToken)object5, object2);
            object3.add(object5);
        }
        if (bl3 = object2 instanceof TypeAdapter) {
            object = TypeToken.get((Type)object);
            object2 = (TypeAdapter)object2;
            object = TypeAdapters.newFactory((TypeToken)object, (TypeAdapter)object2);
            object2 = this.factories;
            object2.add(object);
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeAdapterFactory);
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class object, Object object2) {
        TypeAdapterFactory typeAdapterFactory;
        boolean bl2;
        Objects.requireNonNull(object);
        boolean bl3 = object2 instanceof JsonSerializer;
        if (!(bl3 || (bl2 = object2 instanceof JsonDeserializer) || (bl2 = object2 instanceof TypeAdapter))) {
            bl2 = false;
            typeAdapterFactory = null;
        } else {
            bl2 = true;
        }
        $Gson$Preconditions.checkArgument(bl2);
        bl2 = object2 instanceof JsonDeserializer;
        if (bl2 || bl3) {
            List list = this.hierarchyFactories;
            typeAdapterFactory = TreeTypeAdapter.newTypeHierarchyFactory((Class)object, object2);
            list.add(typeAdapterFactory);
        }
        if (bl3 = object2 instanceof TypeAdapter) {
            object2 = (TypeAdapter)object2;
            object = TypeAdapters.newTypeHierarchyFactory((Class)object, (TypeAdapter)object2);
            object2 = this.factories;
            object2.add(object);
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(int n3) {
        this.dateStyle = n3;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int n3, int n4) {
        this.dateStyle = n3;
        this.timeStyle = n4;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(String string2) {
        this.datePattern = string2;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy ... exclusionStrategyArray) {
        Objects.requireNonNull(exclusionStrategyArray);
        for (ExclusionStrategy exclusionStrategy : exclusionStrategyArray) {
            Excluder object;
            Excluder excluder = this.excluder;
            boolean bl2 = true;
            this.excluder = object = excluder.withExclusionStrategy(exclusionStrategy, bl2, bl2);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        return this.setFieldNamingStrategy(fieldNamingPolicy);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        Objects.requireNonNull(longSerializationPolicy);
        this.longSerializationPolicy = longSerializationPolicy;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.numberToNumberStrategy = toNumberStrategy;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        Objects.requireNonNull(toNumberStrategy);
        this.objectToNumberStrategy = toNumberStrategy;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d2) {
        double d5;
        double d7;
        double d9;
        boolean bl2 = Double.isNaN(d2);
        if (!bl2 && (d9 = (d7 = d2 - (d5 = 0.0)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) >= 0) {
            Excluder excluder;
            this.excluder = excluder = this.excluder.withVersion(d2);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid version: ");
        stringBuilder.append(d2);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

