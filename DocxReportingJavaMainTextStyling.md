# Text styling #

Since **[XDocReport 0.9.3](XDocReport093.md)** provides **text styling** feature. You can see demo at http://xdocreport.opensagres.cloudbees.net/textStyling.jsp?reportId=docx

## What is text styling? ##

XDocReport can replace a mergefield from docx report:

![http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation1.png](http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation1.png)

by a value coming from Java context:

```
context.put("comments", "Text coming from Java context.");
```

to generate this report :

![http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation2.png](http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation2.png)

Since **[XDocReport 0.9.3](XDocReport093.md)**, XDocReport  provides the capability to style the text of the Java context with some syntax (HTML, Wiki, etc). For instance you can set text as italic and bold with HTML syntax like this :

```
context.put("comments", "<p><i>Text</i> coming from <b>Java context</b>.</p>");
```

and generate this report :

![http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation3.png](http://wiki.xdocreport.googlecode.com/git/screenshots/DocxTextStylingExplanation3.png)

## Text styling syntax ##

Text Styling uses a syntax to style the text from the Java context. XDocReport provides several syntax like :

  * [HTML syntax](DocxReportingJavaMainHTMLTextStyling.md).
  * [Wiki syntax](DocxReportingJavaMainWikiTextStyling.md) like Mediawiki, Google wiki.

But it's possible to implement your own syntax if you wish.