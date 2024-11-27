class StringCompression {
    public int compress(char[] chars) {
        int i = 1;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        
        while (i < chars.length) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(chars[i]);
                count = 1;
            }
            i++;
        }
        
        if (count > 1) {
            sb.append(count);
        }
        
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        
        return sb.length();
    }

    public static void main(String[] args) {
          StringCompression sc = new StringCompression();
        
        // Example input
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        
        // Compress the character array
        int newLength = sc.compress(chars);
        
        // Print the compressed characters
        System.out.print("Compressed characters: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
        System.out.println("\nNew length: " + newLength);
    }
}