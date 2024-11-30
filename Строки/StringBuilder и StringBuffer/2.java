public class StringConversionDemo {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer и StringBuilder
        String str = "Hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        // Преобразование StringBuffer в String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("String из StringBuffer: " + strFromBuffer);

        // Преобразование StringBuilder в String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("String из StringBuilder: " + strFromBuilder);

        // Преобразование StringBuffer в StringBuilder
        StringBuilder stringBuilderFromBuffer = new StringBuilder(stringBuffer.toString());
        System.out.println("StringBuilder из StringBuffer: " + stringBuilderFromBuffer);

        // Преобразование StringBuilder в StringBuffer
        StringBuffer stringBufferFromBuilder = new StringBuffer(stringBuilder.toString());
        System.out.println("StringBuffer из StringBuilder: " + stringBufferFromBuilder);
    }
}
