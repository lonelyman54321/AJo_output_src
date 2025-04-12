/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    /*
     * Exception decompiling
     */
    public static JsonElement parseReader(JsonReader var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 38->41)] java.lang.Throwable
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

    public static JsonElement parseReader(Reader object) {
        MalformedJsonException malformedJsonException2;
        Object object2;
        block13: {
            IOException iOException2;
            block12: {
                NumberFormatException numberFormatException2;
                block11: {
                    block10: {
                        object2 = new JsonReader((Reader)object);
                        object = JsonParser.parseReader((JsonReader)object2);
                        boolean bl2 = ((JsonElement)object).isJsonNull();
                        if (bl2) break block10;
                        object2 = ((JsonReader)object2).peek();
                        JsonToken jsonToken = JsonToken.END_DOCUMENT;
                        if (object2 == jsonToken) break block10;
                        object2 = "Did not consume the entire document.";
                        try {
                            object = new JsonSyntaxException((String)object2);
                            throw object;
                        }
                        catch (NumberFormatException numberFormatException2) {
                            break block11;
                        }
                        catch (IOException iOException2) {
                            break block12;
                        }
                        catch (MalformedJsonException malformedJsonException2) {
                            break block13;
                        }
                    }
                    return object;
                }
                object2 = new JsonSyntaxException(numberFormatException2);
                throw object2;
            }
            object2 = new JsonIOException(iOException2);
            throw object2;
        }
        object2 = new JsonSyntaxException(malformedJsonException2);
        throw object2;
    }

    public static JsonElement parseString(String string2) {
        StringReader stringReader = new StringReader(string2);
        return JsonParser.parseReader(stringReader);
    }

    public JsonElement parse(JsonReader jsonReader) {
        return JsonParser.parseReader(jsonReader);
    }

    public JsonElement parse(Reader reader) {
        return JsonParser.parseReader(reader);
    }

    public JsonElement parse(String string2) {
        return JsonParser.parseString(string2);
    }
}

