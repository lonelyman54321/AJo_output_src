/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson$1;
import com.google.gson.Gson$2;
import com.google.gson.Gson$3;
import com.google.gson.Gson$4;
import com.google.gson.Gson$5;
import com.google.gson.Gson$FutureTypeAdapter;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final String DEFAULT_DATE_PATTERN;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
    static final ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final List builderFactories;
    final List builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final LongSerializationPolicy longSerializationPolicy;
    final ToNumberStrategy numberToNumberStrategy;
    final ToNumberStrategy objectToNumberStrategy;
    final boolean prettyPrinting;
    final List reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    private final ThreadLocal threadLocalAdapterResults;
    final int timeStyle;
    private final ConcurrentMap typeTokenCache;
    final boolean useJdkUnsafe;

    static {
        DEFAULT_FIELD_NAMING_STRATEGY = FieldNamingPolicy.IDENTITY;
        DEFAULT_OBJECT_TO_NUMBER_STRATEGY = ToNumberPolicy.DOUBLE;
        DEFAULT_NUMBER_TO_NUMBER_STRATEGY = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    }

    public Gson() {
        Excluder excluder = Excluder.DEFAULT;
        FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
        Map map2 = Collections.emptyMap();
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        String string2 = DEFAULT_DATE_PATTERN;
        List list = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        ToNumberStrategy toNumberStrategy = DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        ToNumberStrategy toNumberStrategy2 = DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        List list4 = Collections.emptyList();
        this(excluder, fieldNamingStrategy, map2, false, false, false, true, false, false, false, true, longSerializationPolicy, string2, 2, 2, list, list2, list3, toNumberStrategy, toNumberStrategy2, list4);
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map object, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, LongSerializationPolicy longSerializationPolicy, String string2, int n3, int n4, List list, List list2, List list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2, List list4) {
        ConstructorConstructor constructorConstructor;
        Gson gson = this;
        Object object2 = excluder;
        Object object3 = object;
        boolean bl10 = bl3;
        Object object4 = new ThreadLocal();
        this.threadLocalAdapterResults = object4;
        object4 = new ConcurrentHashMap();
        this.typeTokenCache = object4;
        this.excluder = excluder;
        object4 = fieldNamingStrategy;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = object;
        this.constructorConstructor = constructorConstructor = new ConstructorConstructor((Map)object, bl9, list4);
        boolean bl11 = bl2;
        this.serializeNulls = bl2;
        this.complexMapKeySerialization = bl3;
        bl11 = bl4;
        this.generateNonExecutableJson = bl4;
        bl11 = bl5;
        this.htmlSafe = bl5;
        bl11 = bl6;
        this.prettyPrinting = bl6;
        bl11 = bl7;
        this.lenient = bl7;
        this.serializeSpecialFloatingPointValues = bl8;
        this.useJdkUnsafe = bl9;
        object3 = longSerializationPolicy;
        this.longSerializationPolicy = longSerializationPolicy;
        Object object5 = string2;
        this.datePattern = string2;
        this.dateStyle = n3;
        this.timeStyle = n4;
        object5 = list;
        this.builderFactories = list;
        object5 = list2;
        this.builderHierarchyFactories = list2;
        object5 = toNumberStrategy;
        this.objectToNumberStrategy = toNumberStrategy;
        this.numberToNumberStrategy = toNumberStrategy2;
        this.reflectionFilters = list4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object6 = TypeAdapters.JSON_ELEMENT_FACTORY;
        arrayList.add(object6);
        object5 = ObjectTypeAdapter.getFactory(toNumberStrategy);
        arrayList.add(object5);
        arrayList.add(excluder);
        object5 = list3;
        arrayList.addAll(list3);
        object5 = TypeAdapters.STRING_FACTORY;
        arrayList.add(object5);
        object5 = TypeAdapters.INTEGER_FACTORY;
        arrayList.add(object5);
        object5 = TypeAdapters.BOOLEAN_FACTORY;
        arrayList.add(object5);
        object5 = TypeAdapters.BYTE_FACTORY;
        arrayList.add(object5);
        object5 = TypeAdapters.SHORT_FACTORY;
        arrayList.add(object5);
        object3 = Gson.longAdapter(longSerializationPolicy);
        object5 = TypeAdapters.newFactory(Long.TYPE, Long.class, (TypeAdapter)object3);
        arrayList.add(object5);
        object5 = Double.TYPE;
        TypeAdapter typeAdapter = this.doubleAdapter(bl8);
        object5 = TypeAdapters.newFactory(object5, Double.class, typeAdapter);
        arrayList.add(object5);
        object5 = Float.TYPE;
        object6 = Float.class;
        Object object7 = this.floatAdapter(bl8);
        object7 = TypeAdapters.newFactory(object5, (Class)object6, (TypeAdapter)object7);
        arrayList.add(object7);
        object7 = NumberTypeAdapter.getFactory(toNumberStrategy2);
        arrayList.add(object7);
        object7 = TypeAdapters.ATOMIC_INTEGER_FACTORY;
        arrayList.add(object7);
        object7 = TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
        arrayList.add(object7);
        object5 = Gson.atomicLongAdapter((TypeAdapter)object3);
        object7 = TypeAdapters.newFactory(AtomicLong.class, (TypeAdapter)object5);
        arrayList.add(object7);
        object3 = Gson.atomicLongArrayAdapter((TypeAdapter)object3);
        object3 = TypeAdapters.newFactory(AtomicLongArray.class, (TypeAdapter)object3);
        arrayList.add(object3);
        object3 = TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.CHARACTER_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.STRING_BUILDER_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.STRING_BUFFER_FACTORY;
        arrayList.add(object3);
        object7 = TypeAdapters.BIG_DECIMAL;
        object3 = TypeAdapters.newFactory(BigDecimal.class, (TypeAdapter)object7);
        arrayList.add(object3);
        object7 = TypeAdapters.BIG_INTEGER;
        object3 = TypeAdapters.newFactory(BigInteger.class, (TypeAdapter)object7);
        arrayList.add(object3);
        object7 = TypeAdapters.LAZILY_PARSED_NUMBER;
        object3 = TypeAdapters.newFactory(LazilyParsedNumber.class, (TypeAdapter)object7);
        arrayList.add(object3);
        object3 = TypeAdapters.URL_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.URI_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.UUID_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.CURRENCY_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.LOCALE_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.INET_ADDRESS_FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.BIT_SET_FACTORY;
        arrayList.add(object3);
        object3 = DateTypeAdapter.FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.CALENDAR_FACTORY;
        arrayList.add(object3);
        bl11 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        if (bl11) {
            object3 = SqlTypesSupport.TIME_FACTORY;
            arrayList.add(object3);
            object3 = SqlTypesSupport.DATE_FACTORY;
            arrayList.add(object3);
            object3 = SqlTypesSupport.TIMESTAMP_FACTORY;
            arrayList.add(object3);
        }
        object3 = ArrayTypeAdapter.FACTORY;
        arrayList.add(object3);
        object3 = TypeAdapters.CLASS_FACTORY;
        arrayList.add(object3);
        super(constructorConstructor);
        arrayList.add(object3);
        super(constructorConstructor, bl10);
        arrayList.add(object3);
        super(constructorConstructor);
        gson.jsonAdapterFactory = object3;
        arrayList.add(object3);
        TypeAdapterFactory typeAdapterFactory = TypeAdapters.ENUM_FACTORY;
        arrayList.add(typeAdapterFactory);
        object = typeAdapterFactory;
        super(constructorConstructor, fieldNamingStrategy, excluder, (JsonAdapterAnnotationTypeAdapterFactory)object3, list4);
        arrayList.add(typeAdapterFactory);
        gson.factories = object2 = Collections.unmodifiableList(arrayList);
    }

    private static void assertFullConsumption(Object object, JsonReader object2) {
        block7: {
            if (object != null) {
                MalformedJsonException malformedJsonException2;
                block9: {
                    object = ((JsonReader)object2).peek();
                    object2 = JsonToken.END_DOCUMENT;
                    if (object == object2) break block7;
                    object2 = "JSON document was not fully consumed.";
                    try {
                        object = new JsonSyntaxException((String)object2);
                        throw object;
                    }
                    catch (IOException iOException) {
                    }
                    catch (MalformedJsonException malformedJsonException2) {
                        break block9;
                    }
                    object2 = new JsonIOException(iOException);
                    throw object2;
                }
                object2 = new JsonSyntaxException(malformedJsonException2);
                throw object2;
            }
        }
    }

    private static TypeAdapter atomicLongAdapter(TypeAdapter typeAdapter) {
        Gson$4 gson$4 = new Gson$4(typeAdapter);
        return gson$4.nullSafe();
    }

    private static TypeAdapter atomicLongArrayAdapter(TypeAdapter typeAdapter) {
        Gson$5 gson$5 = new Gson$5(typeAdapter);
        return gson$5.nullSafe();
    }

    public static void checkValidFloatingPoint(double d2) {
        boolean bl2 = Double.isNaN(d2);
        if (!bl2 && !(bl2 = Double.isInfinite(d2))) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    private TypeAdapter doubleAdapter(boolean bl2) {
        if (bl2) {
            return TypeAdapters.DOUBLE;
        }
        Gson$1 gson$1 = new Gson$1(this);
        return gson$1;
    }

    private TypeAdapter floatAdapter(boolean bl2) {
        if (bl2) {
            return TypeAdapters.FLOAT;
        }
        Gson$2 gson$2 = new Gson$2(this);
        return gson$2;
    }

    private static TypeAdapter longAdapter(LongSerializationPolicy object) {
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        if (object == longSerializationPolicy) {
            return TypeAdapters.LONG;
        }
        object = new Gson$3();
        return object;
    }

    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public Object fromJson(JsonElement jsonElement, TypeToken typeToken) {
        if (jsonElement == null) {
            return null;
        }
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonElement);
        return this.fromJson((JsonReader)jsonTreeReader, typeToken);
    }

    public Object fromJson(JsonElement object, Class clazz) {
        TypeToken typeToken = TypeToken.get(clazz);
        object = this.fromJson((JsonElement)object, typeToken);
        return Primitives.wrap(clazz).cast(object);
    }

    public Object fromJson(JsonElement jsonElement, Type object) {
        object = TypeToken.get((Type)object);
        return this.fromJson(jsonElement, (TypeToken)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object fromJson(JsonReader var1_1, TypeToken var2_2) {
        block8: {
            block9: {
                var3_8 = "AssertionError (GSON 2.10.1): ";
                var4_9 = var1_1.isLenient();
                var5_10 = true;
                var1_1.setLenient(var5_10);
                try {
                    var1_1.peek();
                    var5_10 = false;
                    var6_11 = null;
                    var2_2 = this.getAdapter((TypeToken)var2_2);
                    var2_2 = var2_2.read(var1_1);
                }
                catch (Throwable var2_3) {
                    break block8;
                }
                catch (AssertionError var2_4) {
                    ** GOTO lbl-1000
                }
                catch (IOException var2_5) {
                    ** GOTO lbl32
                }
                catch (IllegalStateException var2_6) {
                    ** GOTO lbl34
                }
                catch (EOFException var2_7) {
                    break block9;
                }
                var1_1.setLenient(var4_9);
                return var2_2;
lbl-1000:
                // 1 sources

                {
                    var7_13 = new StringBuilder((String)var3_8);
                    var3_8 = var2_4.getMessage();
                    var7_13.append((String)var3_8);
                    var3_8 = var7_13.toString();
                    var6_12 = new AssertionError((String)var3_8, (Throwable)var2_4);
                    throw var6_12;
lbl32:
                    // 1 sources

                    var3_8 = new JsonSyntaxException(var2_5);
                    throw var3_8;
lbl34:
                    // 1 sources

                    var3_8 = new JsonSyntaxException(var2_6);
                    throw var3_8;
                }
            }
            if (!var5_10) ** GOTO lbl-1000
            var1_1.setLenient(var4_9);
            return null;
lbl-1000:
            // 1 sources

            {
                var3_8 = new JsonSyntaxException(var2_7);
                throw var3_8;
            }
        }
        var1_1.setLenient(var4_9);
        throw var2_3;
    }

    public Object fromJson(JsonReader jsonReader, Type object) {
        object = TypeToken.get((Type)object);
        return this.fromJson(jsonReader, (TypeToken)object);
    }

    public Object fromJson(Reader closeable, TypeToken object) {
        closeable = this.newJsonReader((Reader)closeable);
        object = this.fromJson((JsonReader)closeable, (TypeToken)object);
        Gson.assertFullConsumption(object, (JsonReader)closeable);
        return object;
    }

    public Object fromJson(Reader object, Class clazz) {
        TypeToken typeToken = TypeToken.get(clazz);
        object = this.fromJson((Reader)object, typeToken);
        return Primitives.wrap(clazz).cast(object);
    }

    public Object fromJson(Reader reader, Type object) {
        object = TypeToken.get((Type)object);
        return this.fromJson(reader, (TypeToken)object);
    }

    public Object fromJson(String string2, TypeToken typeToken) {
        if (string2 == null) {
            return null;
        }
        StringReader stringReader = new StringReader(string2);
        return this.fromJson((Reader)stringReader, typeToken);
    }

    public Object fromJson(String object, Class clazz) {
        TypeToken typeToken = TypeToken.get(clazz);
        object = this.fromJson((String)object, typeToken);
        return Primitives.wrap(clazz).cast(object);
    }

    public Object fromJson(String string2, Type object) {
        object = TypeToken.get((Type)object);
        return this.fromJson(string2, (TypeToken)object);
    }

    public TypeAdapter getAdapter(TypeToken object) {
        Throwable throwable2;
        boolean bl2;
        Object object2;
        block21: {
            Object object3;
            Object object4;
            Object object5;
            block20: {
                Objects.requireNonNull(object, "type must not be null");
                object2 = (TypeAdapter)this.typeTokenCache.get(object);
                if (object2 != null) {
                    return object2;
                }
                object2 = (Map)this.threadLocalAdapterResults.get();
                if (object2 == null) {
                    object2 = new HashMap();
                    object5 = this.threadLocalAdapterResults;
                    ((ThreadLocal)object5).set(object2);
                    bl2 = true;
                } else {
                    object5 = (TypeAdapter)object2.get(object);
                    if (object5 != null) {
                        return object5;
                    }
                    bl2 = false;
                    object5 = null;
                }
                object4 = new Gson$FutureTypeAdapter();
                object2.put(object, object4);
                Object object6 = this.factories;
                object6 = object6.iterator();
                object3 = null;
                while (true) {
                    boolean bl3 = object6.hasNext();
                    if (!bl3) break block20;
                    object3 = object6.next();
                    object3 = (TypeAdapterFactory)object3;
                    if ((object3 = object3.create(this, (TypeToken)object)) == null) continue;
                    break;
                }
                try {
                    ((Gson$FutureTypeAdapter)object4).setDelegate((TypeAdapter)object3);
                }
                catch (Throwable throwable2) {}
                object2.put(object, object3);
                break block21;
            }
            if (bl2) {
                object4 = this.threadLocalAdapterResults;
                ((ThreadLocal)object4).remove();
            }
            if (object3 != null) {
                if (bl2) {
                    object = this.typeTokenCache;
                    object.putAll(object2);
                }
                return object3;
            }
            object5 = new StringBuilder("GSON (2.10.1) cannot handle ");
            ((StringBuilder)object5).append(object);
            object = ((StringBuilder)object5).toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        if (bl2) {
            object2 = this.threadLocalAdapterResults;
            ((ThreadLocal)object2).remove();
        }
        throw throwable2;
    }

    public TypeAdapter getAdapter(Class object) {
        object = TypeToken.get((Class)object);
        return this.getAdapter((TypeToken)object);
    }

    public TypeAdapter getDelegateAdapter(TypeAdapterFactory object, TypeToken object2) {
        boolean bl2;
        Object object3 = this.factories;
        boolean bl3 = object3.contains(object);
        if (!bl3) {
            object = this.jsonAdapterFactory;
        }
        object3 = this.factories.iterator();
        boolean bl4 = false;
        while (bl2 = object3.hasNext()) {
            Object object4 = (TypeAdapterFactory)object3.next();
            if (!bl4) {
                if (object4 != object) continue;
                bl4 = true;
                continue;
            }
            if ((object4 = object4.create(this, (TypeToken)object2)) == null) continue;
            return object4;
        }
        object3 = new StringBuilder("GSON cannot serialize ");
        ((StringBuilder)object3).append(object2);
        object2 = ((StringBuilder)object3).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder(this);
        return gsonBuilder;
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        boolean bl2 = this.lenient;
        jsonReader.setLenient(bl2);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer object) {
        Object object2;
        boolean bl2 = this.generateNonExecutableJson;
        if (bl2) {
            object2 = JSON_NON_EXECUTABLE_PREFIX;
            ((Writer)object).write((String)object2);
        }
        object2 = new JsonWriter((Writer)object);
        boolean bl3 = this.prettyPrinting;
        if (bl3) {
            object = "  ";
            ((JsonWriter)object2).setIndent((String)object);
        }
        bl3 = this.htmlSafe;
        ((JsonWriter)object2).setHtmlSafe(bl3);
        bl3 = this.lenient;
        ((JsonWriter)object2).setLenient(bl3);
        bl3 = this.serializeNulls;
        ((JsonWriter)object2).setSerializeNulls(bl3);
        return object2;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toJson(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        this.toJson(jsonElement, (Appendable)stringWriter);
        return stringWriter.toString();
    }

    public String toJson(Object object) {
        if (object == null) {
            object = JsonNull.INSTANCE;
            return this.toJson((JsonElement)object);
        }
        Class<?> clazz = object.getClass();
        return this.toJson(object, clazz);
    }

    public String toJson(Object object, Type type2) {
        StringWriter stringWriter = new StringWriter();
        this.toJson(object, type2, stringWriter);
        return stringWriter.toString();
    }

    /*
     * Exception decompiling
     */
    public void toJson(JsonElement var1_1, JsonWriter var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 80->83)] java.lang.Throwable
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

    public void toJson(JsonElement jsonElement, Appendable object) {
        try {
            object = Streams.writerForAppendable((Appendable)object);
        }
        catch (IOException iOException) {
            object = new JsonIOException(iOException);
            throw object;
        }
        object = this.newJsonWriter((Writer)object);
        this.toJson(jsonElement, (JsonWriter)object);
    }

    public void toJson(Object object, Appendable appendable) {
        if (object != null) {
            Class<?> clazz = object.getClass();
            this.toJson(object, clazz, appendable);
        } else {
            object = JsonNull.INSTANCE;
            this.toJson((JsonElement)object, appendable);
        }
    }

    /*
     * Exception decompiling
     */
    public void toJson(Object var1_1, Type var2_5, JsonWriter var3_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 93->96)] java.lang.Throwable
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

    public void toJson(Object object, Type object2, Appendable object3) {
        try {
            object3 = Streams.writerForAppendable((Appendable)object3);
        }
        catch (IOException iOException) {
            object2 = new JsonIOException(iOException);
            throw object2;
        }
        object3 = this.newJsonWriter((Writer)object3);
        this.toJson(object, (Type)object2, (JsonWriter)object3);
    }

    public JsonElement toJsonTree(Object object) {
        if (object == null) {
            return JsonNull.INSTANCE;
        }
        Class<?> clazz = object.getClass();
        return this.toJsonTree(object, clazz);
    }

    public JsonElement toJsonTree(Object object, Type type2) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        this.toJson(object, type2, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        boolean bl2 = this.serializeNulls;
        stringBuilder.append(bl2);
        stringBuilder.append(",factories:");
        Object object = this.factories;
        stringBuilder.append(object);
        stringBuilder.append(",instanceCreators:");
        object = this.constructorConstructor;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

