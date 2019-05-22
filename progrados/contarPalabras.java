package progrados;
public class contarPalabras {
    
        if (Texto1.getText() != null) {
            String h = Texto1.getText();
            h = h.replaceAll("(\\w+)\\p{Punct}(\\s|$)", "$1$2");
            String[] words = h.split(" ");
            BST<SYSTEM.Word> tree = new BST<>();
            SYSTEM.Word[] word = new SYSTEM.Word[100];
            for (int i = 0; i < words.length; i++) {

                word[i] = new SYSTEM.Word();
                String y = words[i];
                word[i].setWord(y);
                SYSTEM.Word[] b = {word[i]};
                for (SYSTEM.Word n : b) {
                    tree.insert(n);
                }
                SystemManager.getInstance().addUnique(tree);
            }
            for (int d = 0, w = 0; d < tree.nodecounter(); d++) {
                if (tree.Gettreenod(d).getWord().equals(txt1.getText())) {
                    w++;
                    String j = Integer.toString(w);
                    txt2.setText(j);
                }

            }

        }
}