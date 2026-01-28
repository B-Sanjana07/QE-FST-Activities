import pytest

# Wallet class
class Wallet:
    def __init__(self):
        self.amount = 0

    def add_cash(self, earned):
        self.amount += earned

    def spend_cash(self, spent):
        self.amount -= spent


# Fixture
@pytest.fixture
def wallet():
    return Wallet()


# Parameterized test
@pytest.mark.parametrize(
    "earned, spent, expected",
    [
        (30, 10, 20),
        (20, 2, 18),
    ]
)
def test_wallet_transactions(wallet, earned, spent, expected):
    # My wallet initially has 0
    assert wallet.amount == 0

    # I add earned units of cash
    wallet.add_cash(earned)

    # I spend spent units of cash
    wallet.spend_cash(spent)

    # I should have expected units remaining
    assert wallet.amount == expected