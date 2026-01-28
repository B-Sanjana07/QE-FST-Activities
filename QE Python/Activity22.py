import pytest

def test_add():
    assert 2 + 3 == 5

def test_subtract():
    assert 5 - 2 == 3

@pytest.mark.activity
def test_multiply():
    assert 2 * 3 == 6

@pytest.mark.activity
def test_divide():
    assert 6 / 2 == 3