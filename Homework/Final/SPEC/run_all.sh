for p in SPEC/test_* ; do java Main $p > ${p/test/solution}.out ; done
for p in SPEC/solution*.out ; do diff -u $p ${p/.out/} ; done

java Main SPEC/sampleInput > SPEC/sampleOutput.out
diff -u SPEC/sampleOutput{,.out}
