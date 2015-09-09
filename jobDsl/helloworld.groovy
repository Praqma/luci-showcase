job('Hello-world') {

  steps {
    shell 'echo hello world'
  }
}

job('Hello-world 2') {

  steps {
    shell 'echo hello world 2'
  }
}
