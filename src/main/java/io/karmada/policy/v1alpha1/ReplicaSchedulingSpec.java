package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"replicaDivisionPreference","replicaSchedulingType","weightPreference"})
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
public class ReplicaSchedulingSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum ReplicaDivisionPreference {

        Aggregated, Weighted
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaDivisionPreference")
    private ReplicaDivisionPreference replicaDivisionPreference;

    public ReplicaDivisionPreference getReplicaDivisionPreference() {
        return replicaDivisionPreference;
    }

    public void setReplicaDivisionPreference(ReplicaDivisionPreference replicaDivisionPreference) {
        this.replicaDivisionPreference = replicaDivisionPreference;
    }

    public enum ReplicaSchedulingType {

        Duplicated, Divided
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaSchedulingType")
    private ReplicaSchedulingType replicaSchedulingType;

    public ReplicaSchedulingType getReplicaSchedulingType() {
        return replicaSchedulingType;
    }

    public void setReplicaSchedulingType(ReplicaSchedulingType replicaSchedulingType) {
        this.replicaSchedulingType = replicaSchedulingType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("weightPreference")
    private WeightPreferenceSpec weightPreference;

    public WeightPreferenceSpec getWeightPreference() {
        return weightPreference;
    }

    public void setWeightPreference(WeightPreferenceSpec weightPreference) {
        this.weightPreference = weightPreference;
    }
}
