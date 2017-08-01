import HTMLButtonElement;
import HTMLDivElement;
import HTMLSpanElement;
import HTMLTextAreaElement;
import HTMLParagraphElement;
import HTMLPreElement;

partial class HTMLDocument{

    @JsOverlay
    public final HTMLButtonElement createButton(){
        return createElement("button");
    }

    @JsOverlay
    public final HTMLDivElement createDiv(){
        return createElement("div");
    }

    @JsOverlay
    public final HTMLSpanElement createSpan(){
        return createElement("span");
    }

    @JsOverlay
    public final HTMLTextAreaElement createTextArea(){
        return createElement("textarea");
    }

    @JsOverlay
    public final HTMLParagraphElement createParagraph(){
        return createElement("p");
    }

    @JsOverlay
    public final HTMLPreElement createPreElement(){
        return createElement("pre");
    }

}