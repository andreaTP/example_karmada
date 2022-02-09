package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"maxGroups","minGroups","spreadByField","spreadByLabel"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@lombok.Setter()
@lombok.experimental.Accessors(prefix = {
    "_",
    ""
})
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class SpreadConstraintsSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("maxGroups")
    private Long maxGroups;

    public Long getMaxGroups() {
        return maxGroups;
    }

    public void setMaxGroups(Long maxGroups) {
        this.maxGroups = maxGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minGroups")
    private Long minGroups;

    public Long getMinGroups() {
        return minGroups;
    }

    public void setMinGroups(Long minGroups) {
        this.minGroups = minGroups;
    }

    public enum SpreadByField {

        cluster, region, zone, provider
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spreadByField")
    private SpreadByField spreadByField;

    public SpreadByField getSpreadByField() {
        return spreadByField;
    }

    public void setSpreadByField(SpreadByField spreadByField) {
        this.spreadByField = spreadByField;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spreadByLabel")
    private String spreadByLabel;

    public String getSpreadByLabel() {
        return spreadByLabel;
    }

    public void setSpreadByLabel(String spreadByLabel) {
        this.spreadByLabel = spreadByLabel;
    }
}
