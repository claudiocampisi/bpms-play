package keypartner.form_modeling;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Header implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "correlation")
   private java.lang.String correlation;
   @org.kie.api.definition.type.Label(value = "key")
   private java.lang.String key;

   public Header()
   {
   }

   public java.lang.String getCorrelation()
   {
      return this.correlation;
   }

   public void setCorrelation(java.lang.String correlation)
   {
      this.correlation = correlation;
   }

   public java.lang.String getKey()
   {
      return this.key;
   }

   public void setKey(java.lang.String key)
   {
      this.key = key;
   }

   public Header(java.lang.String correlation, java.lang.String key)
   {
      this.correlation = correlation;
      this.key = key;
   }

}